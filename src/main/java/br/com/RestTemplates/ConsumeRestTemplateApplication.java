package br.com.RestTemplates;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.RestTemplates.entity.Distritos;

@SpringBootApplication
public class ConsumeRestTemplateApplication {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestTemplateApplication.class, args);
		
		
	
		
	}
	

	
	

}
