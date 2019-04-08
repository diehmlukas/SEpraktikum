package ui;

import javafx.scene.Node;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class AddArea{
    private final AnchorPane anchorPane = new AnchorPane();
    private final Button AddButton = new Button("Hinzufügen");

    public AddArea(TriggerAdd triggerAdd){
        AnchorPane.setTopAnchor(AddButton, 10.0);
        AnchorPane.setLeftAnchor(AddButton, 10.0);
        AnchorPane.setBottomAnchor(AddButton, 10.0);
        anchorPane.getChildren().addAll(AddButton);
    }
    public Node getPane() {
        return anchorPane;
    }

}
