package WorkoutHub.Api.Repository;

import WorkoutHub.Api.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
