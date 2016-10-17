package com.mycompany.myapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity // класс является представлением таблицы в БД
//@Table(name="developers") // класс описывает таблицу developers в БД
public class Developer {

	//@Id // поле указывает уникальность
	//@Column(name="id")
	//@GeneratedValue(strategy = GenerationType.AUTO) // автоматичекая нумерация
	private int id;
	
	//@Column(name="name")
	private String name;
	
	//@Column(name="specialty")
	private String specialty;
	
	//@Column(name="salary")
	private int salary;

	public Developer(int id, String name, String specialty, int salary) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.salary = salary;
    }
	
	public Developer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
