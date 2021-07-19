package com.crmbackend.userService;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.crmbackend.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
//content for future update

	@Query("select u from User u where u.username=:username")
	public Optional<User> getUserByUsername(@Param("username") String username);

	@Query("select u from User u where u.email=:email")
	public Optional<User> getUserByEmail(@Param("email") String email);

	public Long countById(Integer id); // prepare for delete verficiation if it is exist

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}
