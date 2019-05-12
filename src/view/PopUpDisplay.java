package view;

import javafx.scene.layout.*;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class PopUpDisplay {
    private static final String BACKGROUND = "WHITE";
    private Popup myPopUp;

    public PopUpDisplay(){
        setUp();
    }


    protected void setUp(){
        myPopUp = new Popup();
    }


    public void showPopUp(Stage stage){
        if (!myPopUp.isShowing()) {
            myPopUp.show(stage);
        }
        else{
            myPopUp.hide();

        }
    }

    public void hidePopUp(){
        myPopUp.hide();
    }

    protected void addPaneToPopUp(Pane pane){
        myPopUp.getContent().add(pane);
    }
}
