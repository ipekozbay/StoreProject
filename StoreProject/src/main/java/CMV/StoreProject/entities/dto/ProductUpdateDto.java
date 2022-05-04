package CMV.StoreProject.entities.dto;

import java.util.Date;

import CMV.StoreProject.entities.concretes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateDto {

	private int id;
	private int productStockQuantity;
	private String productName;
	private int productPrice;
	private int brandId;
	private int categoryId;
	private Date dateProductWasAdded;
	private Date productExpiryDate;
	private String serialNumberOfTheProduct;


	public ProductUpdateDto(Product product) {
		this(product.getId(),
				product.getProductStockQuantity(), 
				product.getProductName(), 
				product.getProductPrice(),
				product.getBrand().getId(),
				product.getCategory().getCategoryId(),
				product.getDateProductWasAdded(), 
				product.getProductExpiryDate(),
				product.getSerialNumberOfTheProduct());
	}

}
