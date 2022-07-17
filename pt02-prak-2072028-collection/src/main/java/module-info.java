module com.example.pt02prak2072028collection {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pt02prak2072028collection to javafx.fxml;
    opens com.example.pt02prak2072028collection.model to javafx.fxml;
    exports com.example.pt02prak2072028collection;
    exports com.example.pt02prak2072028collection.model;
}