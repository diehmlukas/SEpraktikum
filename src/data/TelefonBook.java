package data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import java.util.ArrayList;
import java.util.List;

public class TelefonBook {

    private final ObservableList<TelefonEntry> observableList = FXCollections.observableList(new ArrayList<>());
    private final FilteredList<TelefonEntry> filtertlist = new FilteredList<>(observableList);

    public TelefonBook() {
        observableList.add(new TelefonEntry( "Fritz", "Schmied", "123"));
        observableList.add(new TelefonEntry( "Anna", "Mayer", "456"));
    }


    public  ObservableList<TelefonEntry> getNumbers() {return observableList;}

    public List<TelefonEntry> search(String value) {
        filtertlist.setPredicate(telefonEntry -> telefonEntry.contains(value));
        return filtertlist;
    }

    public void delete(ObservableList<TelefonEntry> entries) {
        observableList.removeAll(entries);
    }
}
