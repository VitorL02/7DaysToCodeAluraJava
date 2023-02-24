package daystoCodeAluraVitorLucas.com.br.services;

import daystoCodeAluraVitorLucas.com.br.configuration.FeignClientConfiguration;


import daystoCodeAluraVitorLucas.com.br.model.MoviesDTO;


import org.springframework.cloud.openfeign.FeignClient;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
@FeignClient(name ="ibmApi",url = "https://imdb-api.com/", configuration = FeignClientConfiguration.class)
public interface IMBMoviesService {
    @GetMapping(value = "{lang}/API/Top250Movies/k_89a793is")
    MoviesDTO top250Movies(@PathVariable("lang") String lang);
}
