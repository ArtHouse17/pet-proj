package art.backendservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="subjects")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subjects {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String data;

}
