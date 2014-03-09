package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Exercise {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Range(min = 1, max = 120)
	private int minutes;

	@ManyToOne
	private Goal goal;
	
	@NotNull
	private String activity;

	public String getActivity() {
		return activity;
	}
	
	public long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	
	
}
