package com.teamtreehouse.contactmgr.dao;

import com.teamtreehouse.contactmgr.model.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDaoImpl implements ContactDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Contact> findAll() {
        Session session = sessionFactory.openSession();
        List<Contact> contacts = session.createCriteria(Contact.class).list();
        session.close();
        return contacts;
    }

    @Override
    public Contact findById(Long id) {
        Session session = sessionFactory.openSession();
        Contact c = session.get(Contact.class, id);
        session.close();
        return c;
    }
    @Override
    public void save(Contact contact)
    {
      Session session = sessionFactory.openSession();
      session.beginTransaction();
      session.save(contact);
      session.getTransaction().commit();
      session.close();
   
    }
}
