# Spring
####chapter 3. create the custom xmlapplicationcontext.

####chapter 4. Spring instance the bean with 3 methods. Constructor, static factory and factory method.
*     <bean id="testbean" class="org.spring.TestBean"></bean>
*     <bean id="testbean2" class="org.spring.TestBeanFactory" factory-method="getTestBean"></bean>
      public class TestBeanFactory {
          public static TestBean getTestBean() {
             return new TestBean();
          }
      }
*     <bean id="factoryMethod" class="org.core.spring.chapter4.FactoryMethod"></bean>
      <bean id="personService3" factory-bean="factoryMethod" factory-method="createPersonService"></bean>
      public class FactoryMethod {
          public PersonService createPersonService() {
              return new PersonServiceImpl();
          }
      }

####chapter 5. bean scope (singleton/prototype/request/session/global session)
* singleton

      <bean id="personService5" class="org.core.spring.impl.PersonServiceImpl"></bean>
* prototype

       <bean id="personService51" class="org.core.spring.impl.PersonServiceImpl" scope="prototype"></bean>

####chapter 6. bean initiation and destroy
    <bean id="personService6" class="org.core.spring.impl.PersonServiceImpl" lazy-init="true" init-method="init" destroy-method="destory"></bean>
lazy-init can put in the application level

    <beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd" default-lazy-init="true">

d       