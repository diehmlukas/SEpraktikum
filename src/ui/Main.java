package ui;

import data.TelefonBook;
import data.TriggerSearch;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        TelefonBook telefonBook = new TelefonBook();

        EntryArea entryArea = new EntryArea(telefonBook.getNumbers());
        SearchArea searchArea = new SearchArea(value -> entryArea.setItems(telefonBook.search(value)));
        DeleteArea deleteArea = new DeleteArea(() -> telefonBook.delete(entryArea.getSelectedEntries()));


        BorderPane root = new BorderPane();
        root.setTop(searchArea.getPane());
        root.setCenter(entryArea.getPane());
        root.setBottom(deleteArea.getPane());


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
