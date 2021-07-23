package com.crmbackend.allService.teamService.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.crmbackend.entity.Team;

public interface TeamRepository extends PagingAndSortingRepository<Team, Integer> {
	@Query("select t from Team t where t.id=:id")
	public Optional<Team> getTeambyTeamId(@Param("id") Integer id);

	Boolean existsByTeamname(String teamname);
}
