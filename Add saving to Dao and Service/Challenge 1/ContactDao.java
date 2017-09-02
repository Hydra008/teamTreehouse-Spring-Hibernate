package com.teamtreehouse.contactmgr.dao;

import com.teamtreehouse.contactmgr.model.Contact;

import java.util.List;

public interface ContactDao {
    List<Contact> findAll();
    Contact findById(Long id);
    void save(Contact contact);
}
