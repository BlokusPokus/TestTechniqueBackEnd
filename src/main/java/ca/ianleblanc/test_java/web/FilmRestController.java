package ca.ianleblanc.test_java.web;

import ca.ianleblanc.test_java.dtos.FilmDTO;

import ca.ianleblanc.test_java.exceptions.FilmNotFoundException;
import ca.ianleblanc.test_java.service.FilmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/film")
public class FilmRestController {
    private final FilmService filmService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FilmDTO createFilm(@RequestBody FilmDTO filmDTO){
        return filmService.createFilm(filmDTO);
    }

    @GetMapping("/{id}")
    public FilmDTO getFilmById(@PathVariable Long id) throws FilmNotFoundException {
        return filmService.getFilmById(id);
    }
}
