package com.sampleproject.springanotationbasicproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Samsung
{
	
	 String modelNumber;
	 String launchDate;
	 
	  @Autowired 
	  @Qualifier("mediaTek")
	  MobileProcessor cpu;
	  
	  
	  public Samsung(String modelNumber) {
		super();
		this.modelNumber = modelNumber;
	}

	 
	  public void config() 
	  {
		System.out.println("Octa Core,4 gb Ram, 12MP camera");
		
		cpu.process();
	  }
}
