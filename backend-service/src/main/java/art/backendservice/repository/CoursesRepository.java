package art.backendservice.repository;

import art.backendservice.entity.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Courses, Integer> {}
