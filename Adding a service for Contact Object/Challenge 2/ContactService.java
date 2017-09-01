package com.teamtreehouse.contactmgr.service;

import com.teamtreehouse.contactmgr.model.Contact;

public interface ContactService{
  Contact findById(Long id);
}
