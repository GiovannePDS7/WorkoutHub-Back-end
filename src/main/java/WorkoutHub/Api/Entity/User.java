package WorkoutHub.Api.Entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "User")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_User")
    private Long idUser;

    @Column(name = "password_User", nullable = false)
    private String nameUser;

    @Column(name = "email_User", unique = true, nullable = false)
    private String emailUser;

    @Column(name = "password_User", nullable = false)
    private String passwordUser;
}
