package org.bekhsimle.library.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author BHARAT
 *
 */
public class ConnectionUtil {
		
		@Autowired
	    private SessionFactory sessionFactory;

	    private SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	    public Session getSession()
	    {
	        Session session = getSessionFactory().getCurrentSession();
	        if(session == null)
	            session = getSessionFactory().openSession();
	        
	        return session;
	 }
}



