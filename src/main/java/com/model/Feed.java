package com.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;
@Entity
@Component
public class Feed implements Serializable{
	private static final long serialVersionUID = 1L;
	 @EmbeddedId
	 FeedPK feedPk;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	public int units;

	public FeedPK getFeedPk() {
		return feedPk;
	}

	public void setFeedPk(FeedPK feedPk) {
		this.feedPk = feedPk;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
	
	
	

}
