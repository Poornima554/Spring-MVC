package com.dcl.sdb.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dcl.sdb.entity.ProfileUrl;
import com.dcl.sdb.entity.StudentEntity;

@Repository
public class ProfileRepository {

	@Autowired
	private EntityManagerFactory emf;

	public void addUrl(ProfileUrl url) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(url);
		em.getTransaction().commit();
		em.close();
	}

	public ProfileUrl findProfileById(int profileId) {
		EntityManager em = emf.createEntityManager();
		ProfileUrl profile = em.find(ProfileUrl.class, profileId);
		em.close();
		return profile;
	}

	public void updateProfile(ProfileUrl profile) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(profile);
		em.getTransaction().commit();
		em.close();
	}

	public void deleteProfile(int id) {
		EntityManager em = emf.createEntityManager();
		ProfileUrl profile = em.find(ProfileUrl.class, id);
		em.getTransaction().begin();
		em.remove(profile);
		em.getTransaction().commit();
		em.close();
	}
	
	
	
}





















