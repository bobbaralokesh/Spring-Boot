package com.spring.OneToMany.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Mod_Tab")
public class Model {

  @Id	
  @Column(name="Model_Id")
  private Integer id;
  
  @Column(name="MOdel_Name")
  private String modelName;
  
  @Column(name="Model_Code")
  private String modelCode;
	
	
}
