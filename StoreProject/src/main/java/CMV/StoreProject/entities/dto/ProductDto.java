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
	private String productBrand;
	private Date dateProductWasAdded;
	private Date productExpiryDate;
	

	public ProductDto(int productStockQuantity, String productName, int productPrice, String productBrand,
			Date dateProductWasAdded, Date productExpiryDate) {
		//super();
		this.productStockQuantity = productStockQuantity;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.dateProductWasAdded = dateProductWasAdded;
		this.productExpiryDate = productExpiryDate;
	}
	
	public ProductDto(Product product) {
		this(product.getProductStockQuantity(),
				product.getProductName(), 
				product.getProductPrice(), 
				product.getProductBrand(), 
				product.getDateProductWasAdded(), 
				product.getProductExpiryDate());
	}
}
