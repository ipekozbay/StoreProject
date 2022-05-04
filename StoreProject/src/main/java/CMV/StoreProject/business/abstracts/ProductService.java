package CMV.StoreProject.business.abstracts;

import java.util.List;

import CMV.StoreProject.core.utilities.results.DataResult;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.entities.concretes.Product;
import CMV.StoreProject.entities.dto.ProductCreateDto;
import CMV.StoreProject.entities.dto.ProductDto;
import CMV.StoreProject.entities.dto.ProductUpdateDto;

public interface ProductService {

	DataResult<List<ProductDto>> getAll();

	DataResult<List<ProductDto>> getAll(int pageNo, int pageSize);

	Result add(ProductCreateDto product);

	Result delete(int id);

	Result update(ProductUpdateDto productUpdateDto);

//	DataResult<Product> getByProductName(String productName);

//	DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);

//	DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);

//	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

//	DataResult<List<Product>> getByProductNameContains(String productName);

//	DataResult<List<Product>> getByProductNameStartsWith(String productName);

//	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

//	DataResult<	List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	
}