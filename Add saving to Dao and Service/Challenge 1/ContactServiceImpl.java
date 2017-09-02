package com.teamtreehouse.contactmgr.service;

import com.teamtreehouse.contactmgr.dao.ContactDao;
import com.teamtreehouse.contactmgr.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactDao contactDao;

    @Override
    public List<Contact> findAll() {
        return contactDao.findAll();
    }

    @Override
    public Contact findById(Long id) {
        return contactDao.findById(id);
    }
    @Override
    public void save(Contact contact)
    {
    contactDao.save(contact); 
    }
}
