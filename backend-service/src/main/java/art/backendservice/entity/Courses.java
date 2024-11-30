package art.backendservice.entity;

import art.userservice.entity.Tutors;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn(name = "subjects_id")
    @NotNull
    private Subjects subjects;

    private String tutorsId;
}
