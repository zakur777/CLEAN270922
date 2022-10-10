package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class GlobalConfiguration {

	
	@Bean
	JsonMapper getJsonMapper() {
		return new JsonMapper();
	}
	
}
