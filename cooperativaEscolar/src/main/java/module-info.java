module cr.ac.una.cooperativaescolar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens cr.ac.una.cooperativaescolar to javafx.fxml;
    exports cr.ac.una.cooperativaescolar;
}
