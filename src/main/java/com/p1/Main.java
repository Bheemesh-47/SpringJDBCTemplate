package com.p1;

//Importing SQL classes 
import java.sql.SQLException; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

//Class 
public class Main { 
	public static void main(String[] args) 
		throws SQLException, ClassNotFoundException 
	{ 

		// Using ApplicationContext tom implement Spring IoC 
		ApplicationContext context 
			= new ClassPathXmlApplicationContext( 
				"applicationContext.xml"); 

		// Get the bean studentDAO 
		StudentDAO studentDAO = context.getBean( 
			"studentDAO", StudentDAO.class); 

		// Calling the method 
		studentDAO.selectAllRows(); 
	} 
}
