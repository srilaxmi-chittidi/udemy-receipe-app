package com.springmvc.receipeapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.springmvc.receipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
