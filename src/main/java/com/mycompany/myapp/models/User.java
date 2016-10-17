package com.mycompany.myapp.models;

import javax.validation.constraints.Size;

public class User {

	// валидация данных
	@Size(min = 5, max = 20, message = "Имя должно быть от 5 до 20 знаков")
	private String name;
	
	@Size(min = 10, max = 30, message = "Пароль должен быть от 10 до 20 знаков")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
