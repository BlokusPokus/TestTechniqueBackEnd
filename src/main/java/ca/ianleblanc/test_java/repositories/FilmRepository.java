package ca.ianleblanc.test_java.repositories;

import ca.ianleblanc.test_java.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
    boolean existsByTitre(String titre);
}
