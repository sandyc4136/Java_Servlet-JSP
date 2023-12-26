package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cdac.entity.Album;
import com.cdac.entity.Song;

import javax.persistence.*;

//this is wrong, we should create separate dao for each entity
public class SongDao {

	public void add(Song song) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("album-song"); //META-INF/persistence.xml
			EntityManager em = emf.createEntityManager();
	
			em.getTransaction().begin();
			em.persist(song); //persist will generate insert query
			em.getTransaction().commit();
		}
		finally {
			emf.close();	
		}
	}

}
