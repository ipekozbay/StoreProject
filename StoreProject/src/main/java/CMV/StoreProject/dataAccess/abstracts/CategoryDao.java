package CMV.StoreProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import CMV.StoreProject.entities.concretes.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

	boolean existsByCategoryName(String categoryName);
}
