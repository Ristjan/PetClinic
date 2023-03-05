module com.example.petclinic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.petclinic to javafx.fxml;
    exports com.example.petclinic;
}