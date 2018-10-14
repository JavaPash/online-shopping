package net.pash.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.pash.onlineshoppingbackend.dao.CategoryDAO;
import net.pash.onlineshoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static{
		
				Category category = new Category();
				category.setCid(1);
				category.setCname("Mobile");
				category.setCdescription("This is mobile Category..!");
				category.setImageUrl("CAT_1.jpg");
				categories.add(category);
				
				category = new Category();
				category.setCid(2);
				category.setCname("TV");
				category.setCdescription("This is TV Category..!");
				category.setImageUrl("CAT_2.jpg");
				categories.add(category);
				
				category = new Category();
				category.setCid(3);
				category.setCname("Laptop");
				category.setCdescription("This is Laptop Category..!");
				category.setImageUrl("CAT_3.jpg");
				categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category: categories)
		{
			if(category.getCid()==id)
			{
				return category;
			}
		}
		return null;
	}

}
