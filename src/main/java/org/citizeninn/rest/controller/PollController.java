package org.citizeninn.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.citizeninn.rest.doa.PollRepository;
import org.citizeninn.rest.domain.Poll;
import org.citizeninn.rest.service.PollService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

	private final PollService pollService;

	private final PollRepository pollRepository;

	@Inject
	public PollController(final PollService pollService, final PollRepository pollRepository) {
		this.pollService = pollService;
		this.pollRepository = pollRepository;
	}

	@RequestMapping(value = "/poll", method = RequestMethod.POST)
	public Poll createPoll(@RequestBody Poll poll) {
		return pollService.save(poll);
	}

	@RequestMapping(value = "/polls", method = RequestMethod.GET)
	public List<Poll> getAllPolls() {

		return pollRepository.findAll();
	}

}