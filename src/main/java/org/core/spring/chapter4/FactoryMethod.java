package org.core.spring.chapter4;

import org.core.spring.PersonService;
import org.core.spring.impl.PersonServiceImpl;

public class FactoryMethod {
    public PersonService createPersonService() {
        return new PersonServiceImpl();
    }
}
