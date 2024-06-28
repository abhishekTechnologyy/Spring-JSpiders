package org.jsp.customeraddress;

	import javax.persistence.EntityManager;
	import javax.persistence.Persistence;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;

	@Configuration
	@ComponentScan({ "org.jsp.customeraddress" })
	public class CustomerAddressConfig {
		@Bean
		public EntityManager entityManager() {
		return Persistence.createEntityManagerFactory("development").createEntityManager();
		}

}
