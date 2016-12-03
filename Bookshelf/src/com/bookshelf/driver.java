package com.bookshelf;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class driver {

	public static void main(String[] args) {
		
		Authentication auth = new Authentication();

		auth.addUser(new User("Bill", "pass"));
		auth.addUser(new User("Bilbo", "pass1"));
		auth.printUsers();
		auth.addUser( new User("jill", "jill2"));
		auth.printUsers();
		auth.removeUser("jill", "jill2");
		auth.printUsers();


//		create a database connection and store these files in the db. 
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//
//		for (Object book : library){
//			session.save(book);
//			System.out.println(book);
//		}
//
//		session.getTransaction().commit();
//		session.close();
//		sessionFactory.close();		
		
	}
}
