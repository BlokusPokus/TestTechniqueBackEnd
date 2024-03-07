package ca.ianleblanc.test_java.mappers;
import ca.ianleblanc.test_java.dtos.FilmDTO;
import ca.ianleblanc.test_java.entities.Film;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FilmMapperImpl {
    @Mapping(target = "acteurs", source = "acteurs")
    FilmDTO filmToFilmDTO(Film film);

    @Mapping(target = "acteurs", source = "acteurs")
    Film filmDTOToFilm(FilmDTO filmDTO);
}
