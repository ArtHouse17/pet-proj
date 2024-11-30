package art.backendservice.dto;

import art.backendservice.entity.Subjects;
import lombok.Data;

@Data
public class CoursesDTO {
    private String name;
    private String description;
    private Subjects subjects;
    private String tutorsId;
}
