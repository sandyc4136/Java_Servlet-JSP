package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cdac.entity.Album;

import javax.persistence.*;

//this is wrong, we should create separate dao for each entity
public class AlbumDao {

	public void add(Album album) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("album-song"); //META-INF/persistence.xml
			EntityManager em = emf.createEntityManager();
	
			em.getTransaction().begin();
			em.persist(album); //persist will generate insert query
			em.getTransaction().commit();
		}
		finally {
			emf.close();	
		}
	}
	
	public Album fetchAlbumById(int id) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("album-song"); //META-INF/persistence.xml
			EntityManager em = emf.createEntityManager();
	
			Album album = em.find(Album.class, id);
			return album;
		}
		finally {
			emf.close();
		}
	}

}
