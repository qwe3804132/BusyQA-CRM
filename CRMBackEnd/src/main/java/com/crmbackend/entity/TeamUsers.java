package com.crmbackend.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "team_users")
public class TeamUsers {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	 
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "team_id")
	    private Team team;

	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "user_id")
	    private User user;
	    
	    private Integer active;

		
		public TeamUsers(Team team, User user, Integer active) {
			super();
			this.team = team;
			this.user = user;
			this.active = active;
		}

		public TeamUsers() {
			
		}

		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Team getTeam() {
			return team;
		}
		public void setTeam(Team team) {
			this.team = team;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Integer getActive() {
			return active;
		}
		public void setActive(Integer active) {
			this.active = active; 
		}

		@Override
		public int hashCode() {
			return Objects.hash(active, team, user);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TeamUsers other = (TeamUsers) obj;
			return Objects.equals(active, other.active) && Objects.equals(team, other.team)
					&& Objects.equals(user, other.user);
		}
		
	
	    
}
