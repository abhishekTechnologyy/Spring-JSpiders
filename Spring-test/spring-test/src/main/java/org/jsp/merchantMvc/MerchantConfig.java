package org.jsp.merchantMvc;

	import javax.persistence.EntityManager;
	import javax.persistence.Persistence;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;

	@Configuration
	@ComponentScan(basePackages = { "org.jsp.merchantMvc" })
	
	public class MerchantConfig {
		@Bean
		public EntityManager entityManager() {
			return Persistence.createEntityManagerFactory("dev")
					.createEntityManager();
		}
	}

