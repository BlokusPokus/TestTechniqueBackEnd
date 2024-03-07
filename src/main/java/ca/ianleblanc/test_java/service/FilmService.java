package ca.ianleblanc.test_java.service;
import ca.ianleblanc.test_java.dtos.FilmDTO;
import ca.ianleblanc.test_java.exceptions.FilmNotFoundException;


public interface FilmService {
    FilmDTO createFilm(FilmDTO filmDTO);
    FilmDTO getFilmById(Long id) throws FilmNotFoundException;

}
