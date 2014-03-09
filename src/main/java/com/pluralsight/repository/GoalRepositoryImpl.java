package com.pluralsight.repository;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		em.persist(goal);
		em.flush();	
		return goal;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Goal> loadAll() {
		Query query = (Query) em.createQuery("select g from Goal g");
		
		List goals = ((javax.persistence.Query) query).getResultList();
		return goals;
	}

}
