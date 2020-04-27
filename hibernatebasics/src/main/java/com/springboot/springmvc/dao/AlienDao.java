package com.springboot.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.springmvc.model.Alien;

@Component
public class AlienDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Alien> getAliens() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Alien", Alien.class).list();
	}
}
