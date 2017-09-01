package com.teamtreehouse.contactmgr.service;

import com.teamtreehouse.contactmgr.dao.ContactDao;
import com.teamtreehouse.contactmgr.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ContactServiceImpl implements ContactService
{
@Autowired
private ContactDao contactDao;
 @Override
 public Contact findById(Long id)
 {
 return contactDao.findById();
 }
}
