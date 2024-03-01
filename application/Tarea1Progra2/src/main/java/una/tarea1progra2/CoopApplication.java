package una.tarea1progra2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CoopApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CoopApplication.class.getResource("hello-view.fxml"));

        // ES LA APLICACION EN SÍ
        Scene scene = new Scene(fxmlLoader.load(), 320, 240); // ESCENA PRINCIPAL

        stage.setTitle("titulo de la aplicacion");

        stage.setScene(scene); // COLOCAR LA PRIMERA ESCENA EN EL STAGE
        stage.show(); // MOSTRAR LA ESCENA COLOCADA
    }
    public static void main(String[] args) {
        launch();
    } // EJECUTA LA APLICACION
}