package com.category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

	
	List<Category> categorylist=new ArrayList<Category>();
	
	
	public List<Category> retrieveCategory(){
		return categorylist;
	}
	
	public void addcategroy(Category cat){
		categorylist.add(cat);
	}
	
	public void deletecategory(Category cat){
		categorylist.remove(cat);
	}
}
