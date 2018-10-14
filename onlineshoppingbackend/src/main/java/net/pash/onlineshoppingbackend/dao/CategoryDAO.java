package net.pash.onlineshoppingbackend.dao;

import java.util.List;

import net.pash.onlineshoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
