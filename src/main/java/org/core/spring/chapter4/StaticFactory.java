package org.core.spring.chapter4;

import org.core.spring.PersonService;
import org.core.spring.impl.PersonServiceImpl;

public class StaticFactory {
    public static PersonService getPersonService() {
        return new PersonServiceImpl();
    }
}
