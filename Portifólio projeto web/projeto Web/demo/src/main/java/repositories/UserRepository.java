package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import resource.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
