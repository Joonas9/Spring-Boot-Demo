package core.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import core.model.Example;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Integer> {

}
