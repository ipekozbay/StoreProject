package CMV.StoreProject.entities.dto;

import java.util.Date;

public class ProductDto {

	private int productStockQuantity;
	private String productName;
	private int productPrice;
	private String productBrand;
	private Date dateProductWasAdded;
	private Date productExpiryDate;

	public ProductDto(int productStockQuantity, String productName, int productPrice, String productBrand,
			Date dateProductWasAdded, Date productExpiryDate) {
		super();
		this.productStockQuantity = productStockQuantity;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.dateProductWasAdded = dateProductWasAdded;
		this.productExpiryDate = productExpiryDate;
	}

}
