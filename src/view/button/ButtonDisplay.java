package view.button;

import javafx.scene.control.Button;

public abstract class ButtonDisplay {
    private Button myButton;

    ButtonDisplay(String name){
        myButton = new Button(name);
        myButton.setOnMouseClicked(e-> onClick());
    }


    public abstract void onClick();

    public Button getButton(){
        return myButton;
    }

    public void disableButton(){
        myButton.setDisable(true);
    }
    public void enableButton(){
        myButton.setDisable(false);
    }
}
