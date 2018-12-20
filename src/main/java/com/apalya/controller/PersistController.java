package com.apalya.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import com.apalya.dao.UserMessageDao;
//import com.apalya.model.UserMessage;
import com.apalya.model.Guest;
import com.apalya.dao.GuestDao;
import com.apalya.dto.UserMessageDto;
import com.apalya.constant.URLConstant;
import com.apalya.service.BusinessService;

@Controller
public class PersistController {

	//public static final Logger log4j = Logger.getLogger(PersistController.class);
	
	//@Autowired
	//private UserMessageDao userMessageDao;
	@Autowired
    private BusinessService businessService;
	
	@RequestMapping(value=URLConstant.SAVEMESSAGE)
	//public ModelAndView guestbook(HttpServletRequest request,HttpServletResponse response,@RequestBody UserMessageDto[] dto) {
	public ModelAndView guestbook(HttpServletRequest request,HttpServletResponse response) {
        // Handle a new guest (if any):
		System.out.println("1111");
		System.out.println("PersistController saveMessage start");
	//	log4j.info("PersistController saveMessage start");
		/*List<UserMessage> messageList = userMessageDao.getAllMessage();
		for(int i=0;i<messageList.size();i++)
		{
			UserMessage um = messageList.get(i);
			System.out.println(um.getName());
			System.out.println(um.getEmail());
			System.out.println(um.getSubject());
			System.out.println(um.getMobile());
			System.out.println(um.getMessage());
		}*/
		/*UserMessageDto dtoObj = dto[0];
        String name = dtoObj.getName();
        String email = dtoObj.getEmail();
        String mobile = dtoObj.getMobile();
        String subject = dtoObj.getSubject();
        String message = dtoObj.getMessage();
        UserMessage userMessage = new UserMessage();
        userMessage.setName(name);
        userMessage.setEmail(email);
        userMessage.setMobile(mobile);
        userMessage.setSubject(subject);
        userMessage.setMessage(message);
        
        userMessageDao.persist(userMessage);*/
		System.out.println("End");
       // return new ModelAndView("guest.jsp", "guestDao", guestDao);
        return null;
    }
	
	@RequestMapping(value="/guest")
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String name = request.getParameter("name");
        if (name != null)
        	businessService.persist(new Guest(name));
        return  new ModelAndView("guest.jsp", "businessService", businessService);
    }
	
	@RequestMapping(value=URLConstant.SHOWMESSAGE)
    public ModelAndView showMessage(HttpServletRequest request) {
     	System.out.println("showMessage ");
        List<Guest> guestList = businessService.getAllGuests();
        return null;
    }
}
