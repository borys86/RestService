package org.citizeninn.rest.doa;

import org.citizeninn.rest.domain.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, String> {}