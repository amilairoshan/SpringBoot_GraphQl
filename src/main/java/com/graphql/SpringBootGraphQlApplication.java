package com.graphql;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.graphql.dto.PostCommentsDTO;
import com.graphql.dto.PostDTO;

import graphql.kickstart.tools.SchemaParserDictionary;

@SpringBootApplication
public class SpringBootGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphQlApplication.class, args);
	}

	@Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
	
	
}
