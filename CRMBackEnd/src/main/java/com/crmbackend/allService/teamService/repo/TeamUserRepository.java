package com.crmbackend.allService.teamService.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crmbackend.entity.TeamUsers;

public interface TeamUserRepository extends PagingAndSortingRepository<TeamUsers, Integer> {

}
