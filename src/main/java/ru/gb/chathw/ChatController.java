package ru.gb.chathw;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private TextArea messageArea;

    @FXML
    private TextField messageField;

    @FXML
    private void checkButtonClick() {
        final String message = messageField.getText();
        final String text = message;
        messageArea.appendText(text + "\n");
        messageField.clear();
        messageField.requestFocus();
    }
}