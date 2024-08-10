package com.sandeep.graphql_poc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private int id;
    private String personName;
    private String phoneNumber;
    private ContactType contactType;
}
