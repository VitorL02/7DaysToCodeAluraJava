package daystoCodeAluraVitorLucas.com.br.controller;


import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import daystoCodeAluraVitorLucas.com.br.model.Movie;
import daystoCodeAluraVitorLucas.com.br.model.MoviesDTO;
import daystoCodeAluraVitorLucas.com.br.services.IBDMServiceImplements;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MoviesController {


    private final IBDMServiceImplements ibdmServiceImplements;


    @GetMapping("top250Movies")
    public ResponseEntity<MoviesDTO> getAllMovies() {
        MoviesDTO allMovies = ibdmServiceImplements.getAllMovies();
        ibdmServiceImplements.getAllMoviesTitles(allMovies);
        ibdmServiceImplements.getAllMoviesUrls(allMovies);
        ibdmServiceImplements.getSpecifyMovies(allMovies);
        return new ResponseEntity<>(allMovies, HttpStatus.OK);
    }

}
