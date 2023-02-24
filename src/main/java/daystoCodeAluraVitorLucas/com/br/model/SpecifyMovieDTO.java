package daystoCodeAluraVitorLucas.com.br.model;

import lombok.Data;

@Data
public class SpecifyMovieDTO {
    private String id;
    private String title;
    private String image;
    private String imDbRating;
    private String year;

    public SpecifyMovieDTO(String id, String title, String image, String imDbRating, String year) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.imDbRating = imDbRating;
        this.year = year;
    }
}
