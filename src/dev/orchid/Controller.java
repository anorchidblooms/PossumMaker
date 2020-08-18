package dev.orchid;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public TextField tbName;
    @FXML
    public Label lbCharacterName;
    @FXML
    public String userName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tbName.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                lbCharacterName.setText(tbName.getText());

            }
        });
    }
   }

