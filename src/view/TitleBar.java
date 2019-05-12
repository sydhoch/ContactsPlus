package view;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import view.button.AddNewPersonButton;

public class TitleBar {
    private static final String TITLE = "My Contacts";
    private static final String PLUS = "+";

    private Pane myTitleBar;

    public TitleBar(){
        myTitleBar = new HBox();
        addTitleText();
        addAddNewPersonButton();
    }

    private void addTitleText(){
        Text title = new Text(TITLE);
        myTitleBar.getChildren().add(title);
    }

    private void addAddNewPersonButton(){
        AddNewPersonButton addPerson = new AddNewPersonButton(PLUS);
        myTitleBar.getChildren().add(addPerson.getButton());
    }

    public Pane getTitleBar(){
        return myTitleBar;
    }

}
