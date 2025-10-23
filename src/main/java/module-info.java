module htl.steyr.passwordmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens htl.steyr.passwordmanager to javafx.fxml;
    exports htl.steyr.passwordmanager;
}