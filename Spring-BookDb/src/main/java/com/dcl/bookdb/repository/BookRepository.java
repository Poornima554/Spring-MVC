package com.dcl.bookdb.repository;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dcl.bookdb.entity.BookEntity;

@Repository
public class BookRepository {
	@Autowired
	private EntityManagerFactory emf;

	public void addBook(BookEntity book) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		em.close();
	}

	public BookEntity findBookById(int id) {
		EntityManager em = emf.createEntityManager();
		BookEntity book = em.find(BookEntity.class, id);
		return book;
	}

	public List<BookEntity> findBookByAuthor(String author) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT b FROM BookEntity b WHERE b.author = :author");
		query.setParameter("author", author);

		List<BookEntity> list = query.getResultList();
		return list;
	}

	public List<BookEntity> findBookByGenre(String genre) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT b FROM BookEntity b WHERE b.genre = :genre");
		query.setParameter("genre", genre);

		List<BookEntity> list = query.getResultList();
		return list;
	}

	public int updateBookPriceByTitleAndAuthor(String title, String author, double price) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("UPDATE BookEntity b SET b.price= :price WHERE b.title= :title and b.author = :author");
		query.setParameter("title", title);
		query.setParameter("author", author);
		query.setParameter("price", price);

		int res = query.executeUpdate();
		em.getTransaction().commit();
		return res;
	}

	public List<BookEntity> findBooksBetweenPrice(double p1, double p2) {
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<BookEntity> cq = cb.createQuery(BookEntity.class);
		Root<BookEntity> root = cq.from(BookEntity.class);
		cq.select(root);
		cq.where(cb.between(root.get("price"), p1, p2));

		Query q = em.createQuery(cq);
		List<BookEntity> book = q.getResultList();
		return book;
	}

	public void deletBookById(int id) {
		EntityManager em = emf.createEntityManager();
		BookEntity book = em.find(BookEntity.class, id);
		em.getTransaction().begin();
		em.remove(book);
		em.getTransaction().commit();
		em.close();
	}

}
