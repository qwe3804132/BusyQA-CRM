package com.crmbackend.allService.teamService.tService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmbackend.allService.teamService.repo.TeamRepository;
import com.crmbackend.allService.teamService.repo.TeamUserRepository;
import com.crmbackend.allService.userService.repo.RoleRepository;
import com.crmbackend.allService.userService.repo.UserRepository;
import com.crmbackend.entity.TeamUsers;

@Service
@Transactional
public class TeamService {
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private TeamRepository teamRepo;
	@Autowired
	private TeamUserRepository teamUserRepo;

	public List<TeamUsers> listAll() {
		return (List<TeamUsers>) teamUserRepo.findAll();

	}
}
