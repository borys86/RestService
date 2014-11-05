package org.citizeninn.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.citizeninn.rest.doa.UserRepository;
import org.citizeninn.rest.domain.User;
import org.citizeninn.rest.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private final UserService userService;

	private final UserRepository userRepository;

	@Inject
	public UserController(final UserService userService, final UserRepository userRepository) {
		this.userService = userService;
		this.userRepository = userRepository;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.save(user);
	}

	@ResponseBody
	@RequestMapping(value = "/passwords", method = RequestMethod.GET)
	public List<String> getAllPasswords() {

		List<String> passwords = new ArrayList<String>();
		for (User user : userRepository.findAll()) {
			passwords.add(user.getPassword());
		}
		return passwords;
	}

	@ResponseBody
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

}