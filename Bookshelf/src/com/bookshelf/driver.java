package com.bookshelf;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("Bill gates", "yolo swag 420"));
		library.add(new Book("yolo swag 430", "420 is best"));
		
		//create a database connection and store these files in the db. 
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		for (Object media : library){
			session.save(media);
			System.out.println(media);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();		
		
	}
}
