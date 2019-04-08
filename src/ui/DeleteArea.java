package ui;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class DeleteArea {
  private final AnchorPane anchorPane = new AnchorPane();
        private final Button deleteButton = new Button("Löschen");

        public DeleteArea(TriggerDelete triggerDelete){
            AnchorPane.setTopAnchor(deleteButton, 10.0);
            AnchorPane.setRightAnchor(deleteButton, 10.0);
            AnchorPane.setBottomAnchor(deleteButton, 10.0);
            anchorPane.getChildren().addAll(deleteButton);
        }
    public Node getPane() {
        return anchorPane;
    }
}
