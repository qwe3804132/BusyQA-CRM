package com.crmbackend.allService.teamService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crmbackend.entity.Team;

public interface TeamRepository extends PagingAndSortingRepository<Team, Integer> {
//	select car from Car car 
//	inner join car.dealerships dealership
//	where dealership in :dealerships
	@Query("select t from Team t")
	public List<Object> getAllTeamAndDetails();

	@Query("select t from Team t join TeamUsers tu on t.id = tu.team where tu.active = 1 group by Team ")
	public List<Object> getAllTeamAndDetailsActive();

	Boolean existsByTeamname(String teamname);

	@Query("select u,tu,t from User u join TeamUsers tu on u.id = tu.user join Team t on t.id = tu.team ")
	public List<Object> getAllUsers();

}
