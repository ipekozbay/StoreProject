package CMV.StoreProject.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CMV.StoreProject.business.abstracts.BrandService;
import CMV.StoreProject.entities.dto.BrandCreateDto;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/brands")

public class BrandController {
	private BrandService brandService;

	public BrandController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	 @PostMapping
	    public ResponseEntity<?> add(@RequestBody BrandCreateDto brandCreateDto){
	        boolean result = this.brandService.add(brandCreateDto);
	        return new ResponseEntity<>(result, HttpStatus.OK);
	    }

}