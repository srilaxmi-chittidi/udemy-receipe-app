package com.springmvc.receipeapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.springmvc.receipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
