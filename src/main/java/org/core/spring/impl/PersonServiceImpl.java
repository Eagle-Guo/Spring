package org.core.spring.impl;

import org.core.spring.PersonService;

public class PersonServiceImpl implements PersonService {
    public void save() {
        System.out.println("saving person service");
    }
}
