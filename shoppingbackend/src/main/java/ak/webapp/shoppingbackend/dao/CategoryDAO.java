package ak.webapp.shoppingbackend.dao;

import java.util.List;

import ak.webapp.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
