package nl.tilburg.Dbdemo.repository;

import nl.tilburg.Dbdemo.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Integer> {
}
