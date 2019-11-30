module id.nukuba {
    requires javafx.controls;
    requires javafx.fxml;

    opens id.nukuba to javafx.fxml;
    exports id.nukuba;
}