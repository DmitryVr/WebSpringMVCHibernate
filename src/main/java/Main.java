import java.sql.SQLException;
import java.util.List;

import com.mycompany.myapp.dao.DeveloperDao;
import com.mycompany.myapp.general.FactoryDao;
import com.mycompany.myapp.models.Developer;

public class Main {
	public static void main(String[] args) {
		
//		FactoryDao factory = FactoryDao.getInstance();
//		DeveloperDao developerDao = factory.getDeveloperDao();
//		
//		List<Developer> developers = null;
//		
//		try {
//			developers = developerDao.getDevelopers();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		for (Developer developer : developers) {
//			
//		
//		System.out.println(developer.getId() + " " +
//		developer.getName() + " " +
//		developer.getSpecialty() + " " +
//		developer.getSalary() 
//		
//				);
//		}
		
		FactoryDao factory = FactoryDao.getInstance();
		DeveloperDao developerDao = factory.getDeveloperDao();
		
		Developer developer = null;
		try {
			developer = developerDao.getDeveloper(2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(developer.getId() + " " +
				developer.getName() + " " +
				developer.getSpecialty() + " " +
				developer.getSalary() 
				
						);
	}
}
