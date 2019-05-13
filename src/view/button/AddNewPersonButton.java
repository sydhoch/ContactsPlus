package view.button;


import controller.ViewMediator;
import view.AddPersonPopUp;
import view.PopUpDisplay;

public class AddNewPersonButton extends ButtonDisplay{
    ViewMediator myMediator;
    PopUpDisplay myPopUp;
    public AddNewPersonButton(String name, ViewMediator mediator){
        super(name);
        myMediator = mediator;
        myPopUp = new AddPersonPopUp();
    }

    @Override
    public void onClick() {
        myMediator.pop(myPopUp);
    }
}
