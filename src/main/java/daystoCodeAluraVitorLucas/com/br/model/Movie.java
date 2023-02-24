package daystoCodeAluraVitorLucas.com.br.model;


import lombok.Data;

@Data
public class Movie {

    private String id;
    private String rank;
    private String title;
    private String fullTitle;
    private String year;
    private String image;
    private String crew;
    private String imDbRating;
    private String imDbRatingCount;

}
