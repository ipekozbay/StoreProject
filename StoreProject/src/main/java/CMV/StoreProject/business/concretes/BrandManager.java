package CMV.StoreProject.business.concretes;

import org.springframework.stereotype.Service;

import CMV.StoreProject.business.abstracts.BrandService;
import CMV.StoreProject.core.utilities.results.ErrorResult;
import CMV.StoreProject.core.utilities.results.Result;
import CMV.StoreProject.core.utilities.results.SuccessResult;
import CMV.StoreProject.dataAccess.abstracts.BrandDao;
import CMV.StoreProject.entities.concretes.Brand;
import CMV.StoreProject.entities.concretes.Product;
import CMV.StoreProject.entities.dto.BrandCreateDto;

@Service
public class BrandManager implements BrandService {

	private BrandDao brandDao;

	public BrandManager(BrandDao brandDao) {
		this.brandDao = brandDao;
	}

	private Result existsByBrandName(String brandName) {

		boolean result = this.brandDao.existsByBrandName(brandName);

		if (result == true)
			return new SuccessResult();

		return new ErrorResult();

	}

	@Override
	public Result add(BrandCreateDto brandCreateDto) {
		Result result = existsByBrandName(brandCreateDto.getBrandName());
		if (result.isSucceess())
			return new ErrorResult("not added");

		Brand brandForCreate = new Brand(brandCreateDto.getBrandName());

		this.brandDao.save(brandForCreate);
		return new SuccessResult("added");
	}

}