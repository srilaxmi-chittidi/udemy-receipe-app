package com.springmvc.receipeapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.receipeapp.domain.Category;
import com.springmvc.receipeapp.domain.UnitOfMeasure;
import com.springmvc.receipeapp.repository.CategoryRepository;
import com.springmvc.receipeapp.repository.UnitOfMeasureRepository;

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepo;
	private UnitOfMeasureRepository unitOfMeasureRepo;
	
	public IndexController(CategoryRepository categoryRepo, UnitOfMeasureRepository unitOfMeasureRepo) {
		super();
		this.categoryRepo = categoryRepo;
		this.unitOfMeasureRepo = unitOfMeasureRepo;
	}

	@RequestMapping({"","/","/index"})
	public String getIndexPage() {
		
		Optional<Category> categoryOptional = categoryRepo.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepo.findByDescription("TeaSpoon");
		
		System.out.println("Category Id is : "+categoryOptional.get().getId());
		System.out.println("UnitOfMeasure Id is : "+unitOfMeasureOptional.get().getId());

		return "index";
	}
	
	
}
