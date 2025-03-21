package WorkoutHub.Api.Dtos;
import lombok.Data;

@Data
public class UserRequestDTO {
    private String nameUser;
    private String emailUser;
    private String passwordUser;
}
