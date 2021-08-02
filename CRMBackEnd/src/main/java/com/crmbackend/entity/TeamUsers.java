package com.crmbackend.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
@Table(name = "team_users")

public class TeamUsers {
	public enum Status {
		ACTIVE, INACTIVE, UNKNOWN
	}

	@EmbeddedId
	private TeamUsersId id;

	@ManyToOne
	@MapsId("teamId")
	@JoinColumn(name = "team_id")
	@JsonBackReference
	private Team team;

	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name = "user_id")
	@JsonManagedReference
	private User user;

	@Column(name = "active")
	@Enumerated(EnumType.STRING)
	private Status active;

	public TeamUsers(Team team, User user, Status active) {
		super();
		this.id = new TeamUsersId(team.getId(), user.getId());
		this.team = team;
		this.user = user;
		this.active = active;
	}

}
