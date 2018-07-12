package org.core.spring.chapter5;

import org.core.spring.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testSpring() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService1 = (PersonService) ctx.getBean("personService5");
        PersonService personService2 = (PersonService) ctx.getBean("personService5");
        System.out.println(personService1 == personService2);

        PersonService personService3 = (PersonService) ctx.getBean("personService51");
        PersonService personService4 = (PersonService) ctx.getBean("personService51");
        System.out.println(personService3 == personService4);
    }

}
