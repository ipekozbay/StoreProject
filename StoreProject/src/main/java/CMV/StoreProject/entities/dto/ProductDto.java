package CMV.StoreProject.entities.dto;

import java.util.Date;

import CMV.StoreProject.entities.concretes.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {

	private int productStockQuantity;
	private String productName;
	private int productPrice;
	private int brandId;
	private Date dateProductWasAdded;
	private Date productExpiryDate;
	

	public ProductDto(int productStockQuantity, String productName, int productPrice, int brandId,
			Date dateProductWasAdded, Date productExpiryDate) {
		//super();
		this.productStockQuantity = productStockQuantity;
		this.productName = productName;
		this.productPrice = productPrice;
		this.brandId = brandId;
		this.dateProductWasAdded = dateProductWasAdded;
		this.productExpiryDate = productExpiryDate;
	}
	
	public ProductDto(Product product) {
		this(product.getProductStockQuantity(),
				product.getProductName(), 
				product.getProductPrice(), 
				product.getBrand().getId(), 
				product.getDateProductWasAdded(), 
				product.getProductExpiryDate());
	}
}
