package org.core.spring.chapter4;

import org.core.spring.PersonService;
import org.core.spring.chapter3.CustomizeApplicationContextLoad;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testSpring() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService2 = (PersonService) ctx.getBean("personService2");
        personService2.save();

        PersonService personService3 = (PersonService) ctx.getBean("personService3");
        personService3.save();
    }

}
