package com.spring.assignment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.assignment.entities.JavaWorld;
import com.spring.assignment.entities.PythonWorld;
import com.spring.assignment.entities.Student;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/assignment/config.xml");
//    	Question 1
    	JavaWorld bean = (JavaWorld)context.getBean("jworld");
    	String str = bean.learningJava();
    	System.out.println(str);
    	
//    	Question 2
    	
    	PythonWorld bean2 = (PythonWorld)context.getBean("pworld");
    	String str1 = bean2.learningPython();
    	System.out.println(str1);
    	
//    	Question 3
    	
    	Student student = (Student)context.getBean("student");
    	System.out.println(student);
    	
    	
    
    }
}
