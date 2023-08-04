package com.example.demo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        BorderPane borderPane = new BorderPane();
        Button button = new Button("Click Me Here");
        borderPane.setCenter(button);
        button.setOnAction(this);

        Scene scene = new Scene(borderPane, 320, 240);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Hello");
    }
}