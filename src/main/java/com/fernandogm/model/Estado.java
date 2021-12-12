package com.fernandogm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="estado")
public class Estado {
	
	@Id  //Se genera ID con DNI o con lo que quiera
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private Pais pais;
}
