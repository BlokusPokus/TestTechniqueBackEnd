package ca.ianleblanc.test_java.repositories;

import ca.ianleblanc.test_java.entities.Acteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeurRepository extends JpaRepository<Acteur, Long> {
}
