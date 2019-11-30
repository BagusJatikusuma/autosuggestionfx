package id.nukuba;

import java.io.IOException;
import java.io.Serializable;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private AutoCompleteTextField textField;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }



}
