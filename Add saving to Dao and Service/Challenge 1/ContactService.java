package com.teamtreehouse.contactmgr.service;

import com.teamtreehouse.contactmgr.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    void save(Contact contact);
}
