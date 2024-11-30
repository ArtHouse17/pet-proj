package art.backendservice.service;

import art.backendservice.dto.CoursesDTO;
import art.backendservice.dto.SubjectsDTO;
import art.backendservice.entity.Subjects;
import art.backendservice.repository.SubjectsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubjectsService {

    private final SubjectsRepository subjectsRepository;

    public Subjects create(SubjectsDTO subjectsDTO) {
        Subjects subjects = Subjects.builder()
                .name(subjectsDTO.getName())
                .data(subjectsDTO.getData())
                .build();
        return subjectsRepository.save(subjects);
    }
}
