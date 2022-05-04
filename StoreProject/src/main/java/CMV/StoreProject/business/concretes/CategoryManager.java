package CMV.StoreProject.business.concretes;

import org.springframework.stereotype.Service;

import CMV.StoreProject.business.abstracts.CategoryService;
import CMV.StoreProject.core.utilities.results.ErrorResult;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.core.utilities.results.SuccessResult;
import CMV.StoreProject.dataAccess.abstracts.CategoryDao;
import CMV.StoreProject.entities.concretes.Brand;
import CMV.StoreProject.entities.concretes.Category;
import CMV.StoreProject.entities.dto.BrandCreateDto;
import CMV.StoreProject.entities.dto.CategoryCreateDto;

@Service
public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	private Result existsByCategoryName(String categoryName) {

		boolean result = this.categoryDao.existsByCategoryName(categoryName);

		if (result == true)
			return new SuccessResult();

		return new ErrorResult();

	}

	@Override
	public Result add(CategoryCreateDto categoryCreateDto) {
		Result result = existsByCategoryName(categoryCreateDto.getCategoryName());
		if (result.isSucceess())
			return new ErrorResult("category name already exists.");
		
		Category categoryForCreate = new Category(categoryCreateDto.getCategoryName());
		
		this.categoryDao.save(categoryForCreate);
		return new SuccessResult("added");
	}
}