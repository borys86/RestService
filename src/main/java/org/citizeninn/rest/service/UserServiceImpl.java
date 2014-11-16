package org.citizeninn.rest.service;

import javax.inject.Inject;

import org.citizeninn.rest.doa.UserRepository;
import org.citizeninn.rest.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	@Inject
	public UserServiceImpl(final UserRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public User save(final User user) {
		return repository.save(user);
	}

	@Override
	public User getById(String id) {
		return repository.getUserById(id);
	}

}