package com.sampleproject.springanotationbasicproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sampleproject.springanotationbasicproject")
public class AppConfig
{
	@Bean
	public Samsung getPhone() 
	{
		Samsung samsung = new Samsung("M21");
		samsung.setLaunchDate("18th March 2020");
		return samsung;
		
	}
	
//	@Bean 
//	public MobileProcessor getProcessor() 
//	{ 
//		  return new Snapdragon(); 
//	}
//	 
}
