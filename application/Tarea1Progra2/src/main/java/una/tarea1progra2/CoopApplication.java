package una.tarea1progra2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
// ---------------------------------------------------------------------------------
// CoopeJuniors - Iniciativa para incentivar el ahorro
// Matteo Vargas Quesada
// Esteban Granados Sibaja

// * Ininiciar un punto de trabajo (directorios, manejo de archivos e interfaces)
// * (por mientras) ignorar las bases de datos
// * crear las interfaces


// git https://github.com/matteoquesada/Tarea-Progra2

public class CoopApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(CoopApplication.class.getResource("hello-view.fxml")); // RAIZ

        // ES LA APLICACION EN SÍ
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720); // ESCENA PRINCIPAL

        stage.setTitle("titulo de la aplicacion");

        stage.setScene(scene); // COLOCAR LA PRIMERA ESCENA EN EL STAGE
        stage.show(); // MOSTRAR LA ESCENA COLOCADA
    }
    public static void main(String[] args) {
        launch();
    } // EJECUTA LA APLICACION
}