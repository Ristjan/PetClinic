package com.example.petclinic.data;

import java.sql.*;

public class Util {
    public static void main(String[] args) {


        try {
            // Load the JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a Connection object
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petclinic?serverTimezone=UTC", "root", "12345");

            // Create a Statement object and execute a query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pets");

            // Loop through the result set and print the pet names
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println(name);
            }

            // Close the ResultSet, Statement, and Connection objects
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}




