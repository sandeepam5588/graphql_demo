package com.sandeep.graphql_poc.repository;

import com.sandeep.graphql_poc.model.Contact;
import com.sandeep.graphql_poc.model.ContactType;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class PhoneBookRepository {
    Map<Integer, Contact> phoneBook = new HashMap<>();
    AtomicInteger id = new AtomicInteger(0);

    public Contact addContact(Contact contact){
        contact.setId(id.incrementAndGet());
        phoneBook.put(id.intValue(), contact);
        return contact;
    }

    public List<Contact> contactList(){
        return phoneBook.values().stream().toList();
    }

    @PostConstruct
    private void init(){
        phoneBook.put(id.incrementAndGet(), new Contact(id.intValue(), "Sandeep", "5588996644", ContactType.HOME));
        phoneBook.put(id.incrementAndGet(), new Contact(id.intValue(), "Srishti", "6699884411", ContactType.HOME));
        phoneBook.put(id.incrementAndGet(), new Contact(id.intValue(), "Manikanta", "1122558899", ContactType.WORK));
        phoneBook.put(id.incrementAndGet(), new Contact(id.intValue(), "Ambarish", "9988665588", ContactType.WORK));
        phoneBook.put(id.incrementAndGet(), new Contact(id.intValue(), "Prashanth", "7744118855", ContactType.WORK));
    }
}

