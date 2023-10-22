package com.springmvc.receipeapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.springmvc.receipeapp.repository.CategoryRepository;
import com.springmvc.receipeapp.repository.RecipeRepository;
import com.springmvc.receipeapp.repository.UnitOfMeasureRepository;

public class SpringReceipeAppBootStrapper implements ApplicationListener<ContextRefreshedEvent> {

	private final CategoryRepository categoryRepo;
	private final RecipeRepository recipeRepo;
	private final UnitOfMeasureRepository unitOfMeasureRepo;
	
	public SpringReceipeAppBootStrapper(CategoryRepository categoryRepo, RecipeRepository recipeRepo,
			UnitOfMeasureRepository unitOfMeasureRepo) {
		super();
		this.categoryRepo = categoryRepo;
		this.recipeRepo = recipeRepo;
		this.unitOfMeasureRepo = unitOfMeasureRepo;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
	}

}
