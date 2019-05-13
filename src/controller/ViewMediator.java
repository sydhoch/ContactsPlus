package controller;

import javafx.stage.Stage;
import view.AddPersonPopUp;
import view.PopUpDisplay;

public class ViewMediator {
    Stage myStage;
    public ViewMediator(Stage stage){
        myStage = stage;

    }

    //TODO: change to changeScene
    public void pop(PopUpDisplay popUp){
        popUp.showPopUp(myStage);
    }
}
