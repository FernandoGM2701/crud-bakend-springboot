package com.fernandogm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="pais")
public class Pais {
	
	@Id  //Se genera ID con DNI o con lo que quiera
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
}
