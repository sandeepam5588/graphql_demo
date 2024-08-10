package com.sandeep.graphql_poc.controller;

import com.sandeep.graphql_poc.model.Contact;
import com.sandeep.graphql_poc.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PhoneBookController {
    @Autowired
    private PhoneBookService phoneBookService;

    @MutationMapping
    public Contact addContact(@Argument Contact contact){
        return phoneBookService.addContact(contact);
    }

    @QueryMapping
    public List<Contact> contactList(){
        return phoneBookService.contactList();
    }
}
