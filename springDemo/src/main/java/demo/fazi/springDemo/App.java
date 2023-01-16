package demo.fazi.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
       Computer com=cont.getBean(Computer.class);
       com.display();
     
    }
}
