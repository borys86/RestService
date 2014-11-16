package org.citizeninn.rest.service;

import javax.inject.Inject;

import org.citizeninn.rest.doa.PollRepository;
import org.citizeninn.rest.domain.Poll;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PollServiceImpl implements PollService {

	private final PollRepository repository;

	@Inject
	public PollServiceImpl(final PollRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public Poll save(final Poll poll) {
		return repository.save(poll);
	}

}