package com.fernandogm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Para guardar en BD necesitamos anotaciones

@Entity
@Table (name="persona")
public class Persona {
	//La anotación de Id es para decirle a la BD que ese atributo será la clave o key
	// que a va definir e identificar a esew objeto
	@Id  //Se genera ID con DNI o con lo que quiera
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (name = "nombre_completo") //Dar nombre distinto a columna
	private String nombre;
	private String apellido;
	private int edad;
	
	//Relacion todo a uno, una persona solo puede tener un pais, un pais puede
	//tener varias personas 
	@ManyToOne
	@JoinColumn (name="id_pais") //Atributo para unir a tablas pais y persona
	private Pais pais;
	@ManyToOne
	@JoinColumn (name="id_estado")
	private Estado estado;
	
	
	
	public Persona(String nombre, String apellido, int edad, Pais pais, Estado estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pais = pais;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
