package com.spring.RestProducer.Entity;


import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@JsonProperty("User-Id")
	private Integer userId;
	@JsonProperty("User-Name")
	private String Name;
	@JsonProperty("User-Mem")
	private String mnumber;
	@JsonProperty("User-Permission")        //@jsonProperty it hides Variable name  it gives alias names
	private Set<String> permissions;           //@jsonIgnore it hides assigned value for variable
	@JsonProperty("User-Mobs")
	private Map<String, String> mobs;
	@JsonIgnore
	private String Password;
	
	
	//private list<> permis;
	// privtae string[] p;
}
