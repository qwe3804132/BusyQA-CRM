package com.crmbackend.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "tblTeams")
@Data

public class Team {

	public Team(Integer id, String teamname, Date delete_date, String description, int active,
			Set<TeamUsers> team_users) {
		super();
		this.id = id;
		this.teamname = teamname;
		this.delete_date = delete_date;
		this.description = description;
		this.active = active;
		this.team_users = team_users;
	}

	public Team() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEAM_ID")
	private Integer id;

	@Column(name = "teamname", length = 128, nullable = false, unique = true)
	private String teamname;
	@Column(name = "delete_date", length = 128, nullable = true)
	private Date delete_date;

	@Column(name = "description", nullable = true, length = 240)
	private String description;

	@Column(name = "active", length = 64, nullable = false)
	private int active;

	@JsonIgnoreProperties("team")
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<TeamUsers> team_users = new HashSet<>();

}
