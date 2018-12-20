package com.apalya.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apalya.model.Guest;
import com.apalya.service.BusinessService;
import com.apalya.dao.GuestDao;

@Service
public class BusinessServiceImpl implements BusinessService{
	@Autowired
    private GuestDao guestDao;
	
	public void persist(Guest guest) {
		// TODO Auto-generated method stub
		guestDao.persist(guest);
	}

	public List<Guest> getAllGuests() {
		// TODO Auto-generated method stub
		return guestDao.getAllGuests();
	}

}
