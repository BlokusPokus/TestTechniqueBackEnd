package ca.ianleblanc.test_java.mappers;

import ca.ianleblanc.test_java.dtos.ActeurDTO;
import ca.ianleblanc.test_java.entities.Acteur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActeurMapperImpl {

    Acteur dtoToActeur(ActeurDTO acteurDTO);
    ActeurDTO acteurToDto(Acteur acteur);

}

