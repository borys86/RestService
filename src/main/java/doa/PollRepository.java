package doa;
import org.springframework.data.jpa.repository.JpaRepository;

import domain.User;

public interface PollRepository extends JpaRepository<User, String> {}