package CMV.StoreProject.business.concretes;

import org.springframework.stereotype.Service;

import CMV.StoreProject.business.abstracts.BrandService;
import CMV.StoreProject.dataAccess.abstracts.BrandDao;
import CMV.StoreProject.entities.concretes.Brand;
import CMV.StoreProject.entities.dto.BrandCreateDto;

@Service
public class BrandManager implements BrandService{

	 private BrandDao brandDao;

	    public BrandManager(BrandDao brandDao) {
	        this.brandDao = brandDao;
	    }
	    @Override
	    public boolean add(BrandCreateDto brandCreateDto) {
	        Brand brandForCreate= new Brand(brandCreateDto.getBrandName());
	        this.brandDao.save(brandForCreate);
	        return true;
	    }
	

}
