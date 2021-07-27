package com.crmbackend.entity;

import java.util.Date;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.*;  
import java.util.Set;  
import java.util.stream.Collectors;  
import java.util.stream.Stream;

@Entity
@Table(name = "tblTeams")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "teamname", length = 128, nullable = false, unique = true)
	private String teamname;
	@Column(name = "delete_date", length = 128, nullable = true)
	private Date delete_date;

	@Column(name = "description", nullable = true, length = 240)
	private String description;

	@Column(name = "active", length = 64, nullable = false)
	private int active;

	@OneToMany(mappedBy = "tblteams", cascade = CascadeType.ALL)
	private Set<TeamUsers> team_users = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Date getDelete_date() {
		return delete_date;
	}

	public void setDelete_date(Date delete_date) {
		this.delete_date = delete_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	

	public Team() {

	};

	public Team(Integer id, String teamname, Date delete_date, String description, int active,TeamUsers...teamusers) {
		super();
		this.id = id;
		this.teamname = teamname;
		this.delete_date = delete_date;
		this.description = description;
		this.active = active;
		
		 for(TeamUsers teamandusers : teamusers) 
			teamandusers.setTeam(this);
	     this.team_users = Stream.of(teamusers).collect(Collectors.toSet());
	}

	public Set<TeamUsers> getTeam_users() {
		return team_users;
	}

	public void setTeam_users(Set<TeamUsers> team_users) {
		this.team_users = team_users;
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, delete_date, description, id, team_users, teamname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return active == other.active && Objects.equals(delete_date, other.delete_date)
				&& Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(team_users, other.team_users) && Objects.equals(teamname, other.teamname);
	}
	

	

	

	



}
