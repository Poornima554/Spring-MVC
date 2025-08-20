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

//import com.dcl.sdb.entity.ProfileUrl;
import com.dcl.sdb.entity.StudentEntity;

@Repository
public class StudentRepository {

	@Autowired
	private EntityManagerFactory emf;

	public void addStudent(StudentEntity st) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(st);
		em.getTransaction().commit();
		em.close();
	}

	public List<StudentEntity> displayStudent() {
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);
		cq.from(StudentEntity.class);

		Query q = em.createQuery(cq);
		List<StudentEntity> list = q.getResultList();
		em.close();
		return list;
	}

	
	public StudentEntity findStudentById(int id) {
		EntityManager em = emf.createEntityManager();
		StudentEntity student = em.find(StudentEntity.class, id);
		return student;
	}
	
	
	public void updateStudent(StudentEntity st) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(st);
		em.getTransaction().commit();
		em.close();
	}

	public void removeStudent(int studentId) {
		EntityManager em = emf.createEntityManager();
		StudentEntity st = em.find(StudentEntity.class, studentId);
		em.getTransaction().begin();
		em.remove(st);
		em.getTransaction().commit();
		em.close();
	}

	public List<StudentEntity> findAllAtudents() {
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);
		cq.from(StudentEntity.class);
		Query q = em.createQuery(cq);
		List<StudentEntity> list = q.getResultList();
		return list;
	}
	
	
}





















