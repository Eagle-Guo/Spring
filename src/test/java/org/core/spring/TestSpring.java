package org.core.spring;

import org.core.spring.Chatper3.CustomizeApplicationContextLoad;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testSpring() {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomizeApplicationContextLoad ctx = new CustomizeApplicationContextLoad("applicationContext.xml");
        PersonService personService = (PersonService) ctx.getBean("personService");
        personService.save();
    }

}
