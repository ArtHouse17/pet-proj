package art.backendservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="subjects")
public class Subjects {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String data;
}
