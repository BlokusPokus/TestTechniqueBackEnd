package ca.ianleblanc.test_java.dtos;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
public class FilmDTO {
    private Long id;
    private String titre;
    private String description;
    private Set<ActeurDTO> acteurs;
}
