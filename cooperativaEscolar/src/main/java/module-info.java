module cr.ac.una.cooperativaescolar {
    requires javafx.controls;
    requires javafx.fxml;

    opens cr.ac.una.cooperativaescolar to javafx.fxml;
    exports cr.ac.una.cooperativaescolar;
}
