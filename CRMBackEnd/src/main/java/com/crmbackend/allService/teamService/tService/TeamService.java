package com.crmbackend.allService.teamService.tService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmbackend.allService.teamService.repo.TeamRepository;
import com.crmbackend.allService.userService.repo.RoleRepository;
import com.crmbackend.allService.userService.repo.UserRepository;
import com.crmbackend.entity.Team;

@Service
@Transactional
public class TeamService {
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private TeamRepository teamRepo;

	public List<Team> listAll() {
		return (List<Team>) teamRepo.findAll();

	}
}
