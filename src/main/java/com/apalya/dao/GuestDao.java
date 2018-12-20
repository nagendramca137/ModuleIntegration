package com.apalya.dao;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.apalya.model.Guest;
 

public interface GuestDao {
    public void persist(Guest guest) ;/*{em.persist(guest); }*/
    public List<Guest> getAllGuests() ;
}