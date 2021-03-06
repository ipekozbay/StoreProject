package CMV.StoreProject.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import CMV.StoreProject.business.abstracts.ProductService;
import CMV.StoreProject.core.utilities.results.DataResult;
import CMV.StoreProject.core.utilities.results.ErrorResult;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.core.utilities.results.SuccessDataResult;
import CMV.StoreProject.core.utilities.results.SuccessResult;
import CMV.StoreProject.dataAccess.abstracts.ProductDao;
import CMV.StoreProject.entities.concretes.Product;
import CMV.StoreProject.entities.dto.ProductCreateDto;
import CMV.StoreProject.entities.dto.ProductDto;
import CMV.StoreProject.entities.dto.ProductUpdateDto;

@Service
public class ProductManager implements ProductService {

	private final ProductDao productDao;

	// @Autowired
	public ProductManager(ProductDao productDao) {
		// super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<ProductDto>> getAll() {

		List<ProductDto> result = this.productDao.findAll().stream().map(ProductDto::new).collect(Collectors.toList());
		return new SuccessDataResult<List<ProductDto>>(result);

	}

	@Override
	public DataResult<List<ProductDto>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		List<ProductDto> result = this.productDao.findAll(pageable).getContent().stream().map(ProductDto::new)
				.collect(Collectors.toList());
		return new SuccessDataResult<List<ProductDto>>(result);
	}

	private Result existsBySerialNumberOfTheProduct(String serialNumberOfTheProduct) {

		boolean result = this.productDao.existsBySerialNumberOfTheProduct(serialNumberOfTheProduct);

		if (result == false)
			return new ErrorResult();

		return new SuccessResult();

	}

	private Result existsById(int id) {

		boolean result = this.productDao.existsById(id);

		if (result == false)
			return new ErrorResult();

		return new SuccessResult();

	}

	@Override
	public Result add(ProductCreateDto productCreateDto) {

		Result result = existsBySerialNumberOfTheProduct(productCreateDto.getSerialNumberOfTheProduct());

		if (result.isSucceess())
			return new ErrorResult("serial number already exists. ");

		Product product = new Product(productCreateDto);
		this.productDao.save(product);
		return new SuccessResult("added.");
	}

	@Override
	public Result delete(int id) {

		Result result = existsById(id);

		if (!result.isSucceess())
			return new ErrorResult("product not exists.");

		this.productDao.deleteById(id);
		return new SuccessResult("deleted.");
	}

	@Override
	public Result update(ProductUpdateDto productUpdateDto) {
		
		Result result = existsById(productUpdateDto.getId());
		if (!result.isSucceess())
			return new ErrorResult("product not exists.");

		Product product = new Product(productUpdateDto);

		this.productDao.save(product);
		return new SuccessResult("updated.");
	}

//	@Override
//	public Result add(Product product) {
//		this.productDao.save(product);
//		return new SuccessResult("product added");
//	}
//
//	@Override
//	public DataResult<Product> getByProductName(String productName) {
//		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName), "Data listed");
//	}
//
//	@Override
//	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
//
//		return new SuccessDataResult<Product>(
//				this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data listed");
//
//	}
//
//	@Override
//	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
//
//		return new SuccessDataResult<List<Product>>(
//				this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "data listed");
//
//	}
//
//	@Override
//	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
//
//		return new SuccessDataResult<List<Product>>(this.productDao.getByCategoryIn(categories), "data listed");
//
//	}
//
//	@Override
//	public DataResult<List<Product>> getByProductNameContains(String productName) {
//
//		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName),
//				"data listed");
//
//	}
//
//	@Override
//	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
//
//		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName),
//				"data listed");
//
//	}
//
//	@Override
//	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
//
//		return new SuccessDataResult<List<Product>>(this.productDao.getByNameAndCategory(productName, categoryId),
//				"data listed");
//
//	}
//

//
//	@Override
//	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
//	
//		return new SuccessDataResult<List<ProductWithCategoryDto>>(this.productDao.getProductWithCategoryDetails());
//	}

}