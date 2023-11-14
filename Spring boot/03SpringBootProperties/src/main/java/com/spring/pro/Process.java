package com.spring.pro;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties("my.db")
public class Process {

	 private String name;
	 private String add;
	 private String id;
}
