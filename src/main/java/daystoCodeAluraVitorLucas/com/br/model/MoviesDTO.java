package daystoCodeAluraVitorLucas.com.br.model;

import java.util.ArrayList;
import java.util.List;

public class MoviesDTO {

    public ArrayList<Movie> items;
    public String errorMessage;

    public ArrayList<Movie> getItems() {
        return items;
    }

    public void setItems(ArrayList<Movie> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
