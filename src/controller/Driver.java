package controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.TitleBar;

public class Driver extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Contacts Plus");
        Group root = new Group();
        ViewMediator mediator = new ViewMediator(stage);
        TitleBar titleBar= new TitleBar(mediator);
        root.getChildren().add(titleBar.getTitleBar());
        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
