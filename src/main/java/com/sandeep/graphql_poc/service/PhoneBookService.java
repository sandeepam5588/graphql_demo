package com.sandeep.graphql_poc.service;

import com.sandeep.graphql_poc.model.Contact;
import com.sandeep.graphql_poc.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneBookService {
    @Autowired
    private PhoneBookRepository phoneBookRepository;

    public Contact addContact(Contact contact){
        return phoneBookRepository.addContact(contact);
    }
    public List<Contact> contactList(){
        return phoneBookRepository.contactList();
    }

}
