package view.button;


import javafx.scene.control.Button;
import view.AddPersonPopUp;
import view.PersonTab;

public class AddNewPersonButton extends ButtonDisplay{
    public AddNewPersonButton(String name){
        super(name);
    }

    @Override
    public void onClick() {
        AddPersonPopUp addPersonPopUp = new AddPersonPopUp();
    }
}
