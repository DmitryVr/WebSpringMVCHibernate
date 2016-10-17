package com.mycompany.myapp.dao;

import java.sql.SQLException;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import com.mycompany.myapp.dao.interfaces.InterfaceDeveloperDao;
import com.mycompany.myapp.models.Developer;
import com.mycompany.myapp.util.HibernateUtil;

public class DeveloperDao implements InterfaceDeveloperDao {

	@Override
	public void addDeveloper(Developer developer) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(developer);
		} finally {
			session.getTransaction().commit();
			session.close();
		}
	}

	@Override
	public void deleteDeveloper(Developer developer) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(developer);
		} finally {
			session.getTransaction().commit();
			session.close();
		}
		
	}

	@Override
	public Developer getDeveloper(int id) throws SQLException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            return (Developer) session.get(Developer.class, id);
        } finally {
            transaction.commit();
            session.close();
        }
//		Developer result = null;
//		
//		Session session = null;
//		
//		try {
//			session = HibernateUtil.getSessionFactory().openSession();
//			result = (Developer) session.load(Developer.class, id);
//		} finally {
//			session.close();
//		}
//		
//		return result;
	}

	@Override
	public List<Developer> getDevelopers() throws SQLException {
		
		List<Developer> developers = null;
				
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("FROM developers");
			developers = query.list();
		} finally {
			session.close();
		}
		
		return developers;
	}

}
