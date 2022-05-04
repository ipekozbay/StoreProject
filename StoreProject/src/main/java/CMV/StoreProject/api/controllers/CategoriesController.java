package CMV.StoreProject.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CMV.StoreProject.business.abstracts.CategoryService;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.entities.dto.CategoryCreateDto;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
	
	private final CategoryService categoryService;

	public CategoriesController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	 @PostMapping("/add")
	    public ResponseEntity<?> add(@RequestBody CategoryCreateDto categoryCreateDto){
	        Result result = this.categoryService.add(categoryCreateDto);
	        return new ResponseEntity<>(result, HttpStatus.OK);
	    }
	

}
