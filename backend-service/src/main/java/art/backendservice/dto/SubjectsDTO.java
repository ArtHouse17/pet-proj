package art.backendservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SubjectsDTO {

    private String name;

    private String data;
}
