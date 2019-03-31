package data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class TelefonBook {

    private final ObservableList<TelefonEntry> observableList = FXCollections.observableList(new ArrayList<>());

    public TelefonBook() {
        observableList.add(new TelefonEntry( "Fritz", "Dude", "123"));
    }
    public  ObservableList<TelefonEntry> getNumbers() {return observableList;}

    public List<TelefonEntry> search(String value) {
        //TODO: return the filterd list of telefon entries based on the given value
        return null;
    }
}
