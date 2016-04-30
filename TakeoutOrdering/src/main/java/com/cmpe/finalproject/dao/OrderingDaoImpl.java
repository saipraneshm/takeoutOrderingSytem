package com.cmpe.finalproject.dao;

/*********************************************************************
 * Author : Sai Pranesh
 * Description: This class creates the database connection and calls
 * the required methods to handle database operations (CRUD operations).
 * It is an implementation of the ProfileDao interface.
 *********************************************************************/

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cmpe.finalproject.model.*;

public class OrderingDaoImpl implements OrderingDao {

	
private EntityManagerFactory entityManagerFactory;
private String status;
	
	//Initializing entity manager factory to get entity manager instances.
	public OrderingDaoImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	
	//Fetching entity manager and performing transaction based operations
	// to make sure data is persisted safely, otherwise the transaction is
	// rolled back. Returning status to indicate the status of the operation.
	@Override
	public String store(Ordering profile) throws SQLException{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		try{
			tx.begin();
			entityManager.merge(profile);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			status = "fail";
		}finally{
			entityManager.close();
			status="success";
		}
		return status;
	}
	
	// Fetching entity manager and performing transaction based operations
	// to make sure data is deleted safely, otherwise the transaction is
	// rolled back. Returning status to indicate the status of the operation.
	@Override
	public String delete(String userid) throws SQLException{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		
		try{
			tx.begin();
			Ordering profile = entityManager.find(Ordering.class, userid);
			entityManager.remove(profile);
			tx.commit();
		}catch(RuntimeException e){
			tx.rollback();
			status = "fail";
		}
		finally{
			entityManager.close();
			status = "success";
		}
		return status;
	}

	//This method is responsible for finding and returning the profile
	//of a user based on the user id given.
	@Override
	public Ordering findById(String userid) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try{
			return entityManager.find(Ordering.class, userid);
		}finally{
			entityManager.close();
		}
	}
		
	
		
	}


