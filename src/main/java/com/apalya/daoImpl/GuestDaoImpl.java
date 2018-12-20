package com.apalya.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apalya.model.Guest;
import com.googlecode.ehcache.annotations.Cacheable;
import com.apalya.dao.GuestDao;

@Component
public class GuestDaoImpl implements GuestDao{
	 // Injected database connection:
    @PersistenceContext 
    private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(Guest guest) {
        em.persist(guest);
    }
 
    // Retrieves all the guests:
    @Cacheable(cacheName="guestCache")
    public List<Guest> getAllGuests() {
    	System.out.println("Guest Dao Started ");
    	
    	/*TypedQuery<Guest> query = em.createQuery(
            "SELECT g FROM Guest g ORDER BY g.id", Guest.class);
    	
    	List<Guest> list = query.getResultList();
    	for(int i=0;i<list.size()-1;i++)
    	{
    		Guest guest = list.get(i);
    		System.out.println("Name "+guest+" Date ");
    	}
    	return list;*/
    	return null;
    }
}
