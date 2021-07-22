package com.crmbackend.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "teams_users", joinColumns = @JoinColumn(name = "team_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> users = new HashSet<>();

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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Team() {

	};

	public Team(Integer id, String teamname, Date delete_date, String description, int active) {
		super();
		this.id = id;
		this.teamname = teamname;
		this.delete_date = delete_date;
		this.description = description;
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + active;
		result = prime * result + ((delete_date == null) ? 0 : delete_date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((teamname == null) ? 0 : teamname.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
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
		if (active != other.active)
			return false;
		if (delete_date == null) {
			if (other.delete_date != null)
				return false;
		} else if (!delete_date.equals(other.delete_date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (teamname == null) {
			if (other.teamname != null)
				return false;
		} else if (!teamname.equals(other.teamname))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamname=" + teamname + ", delete_date=" + delete_date + ", description="
				+ description + ", active=" + active + ", users=" + users + "]";
	}

	public void addUsers(User users) {
		this.users.add(users);
	}

}
