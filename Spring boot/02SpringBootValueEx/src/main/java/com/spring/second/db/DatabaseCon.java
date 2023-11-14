package com.spring.second.db;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Component
@ConfigurationProperties(prefix ="my.app")
public class DatabaseCon {

	  private String driver;
	  private String url;
	  private String username;
	  private String password;
	
	  
}
