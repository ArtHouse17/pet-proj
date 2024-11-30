package art.backendservice.repository;

import art.backendservice.entity.Subjects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends CrudRepository<Subjects, Integer> {
}
