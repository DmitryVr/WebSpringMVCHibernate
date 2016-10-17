package com.mycompany.myapp.general;

import com.mycompany.myapp.dao.DeveloperDao;

public class FactoryDao {
	public static FactoryDao instance = new FactoryDao();
	public DeveloperDao developerDao;
	
	private FactoryDao() {}
	
	public static FactoryDao getInstance() {
		return FactoryDao.instance;
	}
	
	public DeveloperDao getDeveloperDao() {
		if (developerDao == null) developerDao = new DeveloperDao();
		return developerDao;
	}
}
