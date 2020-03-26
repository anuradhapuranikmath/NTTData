package com.nttdata.DBConfigure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConfigure {

	
	public static SessionFactory sessionFactory()
	{
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.xml");
		
		 SessionFactory sessionFactory=cfg.buildSessionFactory();
	     Session session=sessionFactory.openSession();
		return sessionFactory;
	}
	
}
