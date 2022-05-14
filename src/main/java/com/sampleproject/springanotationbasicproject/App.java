package com.sampleproject.springanotationbasicproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */


public class App 
{
   
    	public static void main( String[] args )
        {
        	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        	
           Samsung M21 = factory.getBean(Samsung.class);
    		
    		//Samsung s7 = new Samsung();
           
           	System.out.println(M21);
            M21.config();
            
        }
    
}
