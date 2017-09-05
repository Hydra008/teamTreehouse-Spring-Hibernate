package com.teamtreehouse.contactmgr.controller;

import com.teamtreehouse.contactmgr.service.ContactService;
import com.teamtreehouse.contactmgr.model.Contact;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
  @Autowired
  private ContactService contactService;
  public String add() {
    // TODO: Save the Contact object
    
    return "redirect:/contacts/" + contact.getId();  
  }
}
