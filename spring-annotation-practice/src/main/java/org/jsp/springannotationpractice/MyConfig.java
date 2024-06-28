package org.jsp.springannotationpractice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"org.jsp.springannotationpractice"})
@PropertySource(value= {"jdbc.properties"})
public class MyConfig {

	@Bean
	@Primary
	public List<String> getStudentNames(){
		return Arrays.asList("Virat" , "Dhoni" , "Rohit");
	}
	
	@Bean
	public List<String> getList(){
		return Arrays.asList("Ronaldo" , "Messi" , "Sunil");
	}
	
}
