module una.tarea1progra2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens una.tarea1progra2 to javafx.fxml;
    exports una.tarea1progra2;
}