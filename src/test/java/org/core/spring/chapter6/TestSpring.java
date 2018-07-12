package org.core.spring.chapter6;

import org.core.spring.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testSpring() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService1 = (PersonService) ctx.getBean("personService6");
        personService1.save();
        ctx.close();
    }

}
