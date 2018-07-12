package org.core.spring.impl;

import org.core.spring.PersonService;

public class PersonServiceImpl implements PersonService {
    public PersonServiceImpl () {
        System.out.println("Create instance of PersonServiceImpl bean");
    }

    public void init () {
        System.out.println("Initial PersonServiceImpl bean");
    }
    public void save() {
        System.out.println("saving person service");
    }

    public void destory () {
        System.out.println("destory PersonServiceImpl bean");
    }
}
