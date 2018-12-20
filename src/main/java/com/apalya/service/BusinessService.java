package com.apalya.service;

import java.util.List;

import com.apalya.model.Guest;

public interface BusinessService {

	public void persist(Guest guest) ;/*{em.persist(guest); }*/
	// Retrieves all the guests:
    public List<Guest> getAllGuests() ;
}
