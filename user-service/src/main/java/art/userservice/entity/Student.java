package art.userservice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "students_id")
    private int id;

    @Column(name = "date_of_registration")
    private LocalDateTime date_of_registration;
    @Column(name = "date_of_latest_login")
    private LocalDateTime date_of_latest_login;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
}
