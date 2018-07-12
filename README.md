# Spring
chapter 3. create the custom xmlapplicationcontext.

chapter 4. Spring instance the bean with 3 methods. Constructor, static factory and factory method.
1. <bean id="testbean" class="org.spring.TestBean"></bean>
2. <bean id="testbean2" class="org.spring.TestBeanFactory" factory-method="getTestBean"></bean>
   public class TestBeanFactory {
      public static TestBean getTestBean() {
        return new TestBean();
      }
  }
3.  <bean id="factoryMethod" class="org.core.spring.chapter4.FactoryMethod"></bean>
    <bean id="personService3" factory-bean="factoryMethod" factory-method="createPersonService"></bean>
    public class FactoryMethod {
      public PersonService createPersonService() {
        return new PersonServiceImpl();
      }
    }

chapter 5. bean scope (singleton/prototype/request/session/global session)
1. singleton
   <bean id="personService5" class="org.core.spring.impl.PersonServiceImpl"></bean>
2. prototype
   <bean id="personService51" class="org.core.spring.impl.PersonServiceImpl" scope="prototype"></bean>
