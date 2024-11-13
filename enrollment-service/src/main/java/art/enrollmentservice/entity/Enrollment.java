package art.enrollmentservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "enrollment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Enrollment {
    @Id
    @GeneratedValue
    @Column(name = "enrollment_id")
    private int id;


}
