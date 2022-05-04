package CMV.StoreProject.business.abstracts;

import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.entities.dto.CategoryCreateDto;

public interface CategoryService {

	Result add(CategoryCreateDto categoryCreateDao);
	
}
