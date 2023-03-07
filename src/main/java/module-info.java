module com.example.petclinic {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.petclinic to javafx.fxml;
    exports com.example.petclinic;
    exports com.example.petclinic.logic;
    opens com.example.petclinic.logic to javafx.fxml;
}