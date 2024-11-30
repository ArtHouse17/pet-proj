package art.backendservice.service;

import art.backendservice.dto.CoursesDTO;
import art.backendservice.entity.Courses;
import art.backendservice.repository.CoursesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CoursesService {

    private CoursesRepository coursesRepository;

    public Courses create(CoursesDTO coursesDTO) {
        Courses courses = Courses.builder()
                .name(coursesDTO.getName())
                .description(coursesDTO.getDescription())
                .subjects(coursesDTO.getSubjects())
                .tutorsId(coursesDTO.getTutorsId())
                .build();
        return coursesRepository.save(courses);
    }
}
