package una.tarea1progra2.controller; // ES COMO EL INCLUDE EN C++ el punto es la carpeta


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText; // LABEL == MENSAJE

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



    // MERAMENTE LO QUE PASA CUANDO SE LE DA CLICK AL BOTTON
}