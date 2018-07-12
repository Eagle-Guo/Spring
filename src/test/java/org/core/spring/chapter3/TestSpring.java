package org.core.spring.chapter3;

import org.core.spring.PersonService;
import org.core.spring.chapter3.CustomizeApplicationContextLoad;
import org.junit.jupiter.api.Test;

public class TestSpring {

    @Test
    public void testSpring() {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomizeApplicationContextLoad ctx = new CustomizeApplicationContextLoad("applicationContext.xml");
        PersonService personService = (PersonService) ctx.getBean("personService");
        personService.save();
    }

}
