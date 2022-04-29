package CMV.StoreProject.business.abstracts;

import java.util.List;

import CMV.StoreProject.core.utilities.results.DataResult;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
	

}