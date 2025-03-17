package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;

import java.io.IOException;
public class ButtonController {
    @FXML
    private void handlestartButton(ActionEvent event) throws IOException {
        // Load the game screen FXML
        Parent gameRoot = FXMLLoader.load(getClass().getResource("/fxml/2nd.fxml"));

        // Get the current stage from the event
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene
        stage.setScene(new Scene(gameRoot));
        stage.show();
    }
    @FXML
    private void handletohButton(ActionEvent event) throws IOException {
        // Load the game screen FXML
        Parent gameRoot = FXMLLoader.load(getClass().getResource("/fxml/TOH.fxml"));

        // Get the current stage from the event
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene
        stage.setScene(new Scene(gameRoot));
        stage.show();
    }
    @FXML
    private void handleconnectButton(ActionEvent event) throws IOException {
        // Load the game screen FXML
        Parent gameRoot = FXMLLoader.load(getClass().getResource("/fxml/connect.fxml"));

        // Get the current stage from the event
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene
        stage.setScene(new Scene(gameRoot));
        stage.show();
    }
    @FXML
    private void handletttButton(ActionEvent event) throws IOException {
        // Load the game screen FXML
        Parent gameRoot = FXMLLoader.load(getClass().getResource("/fxml/ttt.fxml"));

        // Get the current stage from the event
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene
        stage.setScene(new Scene(gameRoot));
        stage.show();
    }
    @FXML
    private void handlepongButton(ActionEvent event) throws IOException {
        // Load the game screen FXML
        Parent gameRoot = FXMLLoader.load(getClass().getResource("/fxml/pong.fxml"));

        // Get the current stage from the event
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene
        stage.setScene(new Scene(gameRoot));
        stage.show();
    }

    @FXML
    private void handleexittButton(ActionEvent event) {


        // Get the current stage and close it
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();

        // Exit the application
        System.exit(0);
    }
}
