module htl.steyr.passwordmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    // falls du weitere Libs nutzt:
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires eu.hansolo.toolboxfx;

    // 👇 Das hier ist entscheidend:
    opens htl.steyr.passwordmanager.controller to javafx.fxml;

    // optional, wenn du mehrere Packages hast:
    exports htl.steyr.passwordmanager;
}
