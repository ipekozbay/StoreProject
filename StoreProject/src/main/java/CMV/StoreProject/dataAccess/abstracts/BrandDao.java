package CMV.StoreProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import CMV.StoreProject.entities.concretes.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer> {

	boolean existsByBrandName(String brandName);
	
}
