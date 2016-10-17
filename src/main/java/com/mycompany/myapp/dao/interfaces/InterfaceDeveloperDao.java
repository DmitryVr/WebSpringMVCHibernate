package com.mycompany.myapp.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.myapp.models.Developer;

public interface InterfaceDeveloperDao {

	public void addDeveloper(Developer developer) throws SQLException;
	public void deleteDeveloper(Developer developer) throws SQLException;
	public Developer getDeveloper(int id) throws SQLException;
	public List<Developer> getDevelopers() throws SQLException;
}
