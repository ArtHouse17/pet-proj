package art.userservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tutors")
public class Tutors {
    @Id
    @GeneratedValue
    @Column(name = "tutors_id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
