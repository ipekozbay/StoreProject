package CMV.StoreProject.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CMV.StoreProject.business.abstracts.ProductService;
import CMV.StoreProject.core.utilities.results.DataResult;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.core.utilities.results.SuccessDataResult;
import CMV.StoreProject.core.utilities.results.SuccessResult;
import CMV.StoreProject.dataAccess.abstracts.ProductDao;
import CMV.StoreProject.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(),"data listed"); 
				
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("product added");
	}
}