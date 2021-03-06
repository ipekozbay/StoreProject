package CMV.StoreProject.api.controllers;

import org.springframework.http.HttpStatus;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CMV.StoreProject.business.abstracts.BrandService;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.entities.dto.BrandCreateDto;

@RestController
@RequestMapping("/brands")

public class BrandsController {
	private final BrandService brandService;

	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	 @PostMapping("/add")
	    public ResponseEntity<?> add(@RequestBody BrandCreateDto brandCreateDto){
	        Result result = this.brandService.add(brandCreateDto);
	        return new ResponseEntity<>(result, HttpStatus.OK);
	    }
}