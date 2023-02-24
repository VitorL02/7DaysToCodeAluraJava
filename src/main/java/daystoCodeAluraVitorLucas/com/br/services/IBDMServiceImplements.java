package daystoCodeAluraVitorLucas.com.br.services;

import daystoCodeAluraVitorLucas.com.br.model.Movie;
import daystoCodeAluraVitorLucas.com.br.model.MoviesDTO;
import daystoCodeAluraVitorLucas.com.br.model.SpecifyMovieDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IBDMServiceImplements {

    private final IMBMoviesService ibmMoviesService;

    public MoviesDTO getAllMovies() {
        return ibmMoviesService.top250Movies("en");
    }

    public List<String> getAllMoviesTitles(MoviesDTO moviesDTO) {
        List<String> allTitlesMovies = moviesDTO.getItems().stream().map(Movie::getTitle).collect(Collectors.toList());
        return allTitlesMovies;
    }

    public List<String> getAllMoviesUrls(MoviesDTO moviesDTO) {
        List<String> allTitlesUrls = moviesDTO.getItems().stream().map(Movie::getImage).collect(Collectors.toList());
        return allTitlesUrls;
    }

    public List<SpecifyMovieDTO> getSpecifyMovies(MoviesDTO moviesDTO) {
        List<SpecifyMovieDTO> specifyMovieDTOS = moviesDTO.getItems().stream().map(movie -> new SpecifyMovieDTO(movie.getId(),
                movie.getTitle(), movie.getImage(), movie.getRank(), movie.getYear())).collect(Collectors.toList());
        return specifyMovieDTOS;
    }

}
