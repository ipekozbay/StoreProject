package CMV.StoreProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CMV.StoreProject.business.abstracts.ProductService;
import CMV.StoreProject.core.utilities.results.DataResult;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.entities.concretes.Product;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody int id) {
		return this.productService.delete(id);
	}

	@PostMapping("/update")
	public Result update(@RequestBody Product product) {
		return this.productService.update(product);
	}

//	@GetMapping("/ProductWithCategoryDto")
//	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
//
//		return this.productService.getProductWithCategoryDetails();
//	}
//
//	@GetMapping("/getByProductName")
//	public DataResult<Product> getByProductName(@RequestParam String productName) {
//		return this.productService.getByProductName(productName);
//	}
//
//	@GetMapping("/getByProductNameAndCategory")
//	public DataResult<List<Product>> getByProductNameAndCategory(@RequestParam String productName,
//			@RequestParam int categoryId) {
//		System.out.println(productName);
//		System.out.println(categoryId);
//
//		return this.productService.getByNameAndCategory(productName, categoryId);
//	}
//
//	@GetMapping("/getByProductNameContains")
//	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
//
//		return this.productService.getByProductNameContains(productName);
//	}
//
//	@GetMapping("/getAllByPage")
//	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
//		return this.productService.getAll(pageNo, pageSize);
//	}

}