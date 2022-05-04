package CMV.StoreProject.business.abstracts;

import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.entities.dto.BrandCreateDto;

public interface BrandService {
	
    Result add(BrandCreateDto brandCreateDto);

}