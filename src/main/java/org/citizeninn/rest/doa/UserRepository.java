package org.citizeninn.rest.doa;

import org.citizeninn.rest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

	User getUserById(String asText);
}