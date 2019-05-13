package view;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class AddPersonPopUp extends PopUpDisplay {
    private static final String NAME = "Name: ";
    private static final String DONE = "DONE";

    private Pane myPane;
    private List<TextField> myResponses;

    public AddPersonPopUp(){
        myPane = new VBox();
        TextField nameBox = new TextField();
        myResponses = new ArrayList<>();
        myResponses.add(nameBox);
        nameBox.setPromptText(NAME);
        myPane.getChildren().add(nameBox);
        addPaneToPopUp(myPane);
    }


    private void addSubmitButton() {
        Button done = new Button(DONE);
        done.setOnMouseClicked(e -> readTextFields());
        myPane.getChildren().add(done);
    }

    private void readTextFields(){
        for(TextField t: myResponses){
            String response = t.getText();
        }
    }
}
