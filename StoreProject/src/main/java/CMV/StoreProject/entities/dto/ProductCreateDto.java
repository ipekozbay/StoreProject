package CMV.StoreProject.entities.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDto {

	private int productStockQuantity;
	private String productName;
	private int productPrice;
	private int brandId;
	private int categoryId;
	private Date dateProductWasAdded;
	private Date productExpiryDate;
	private String serialNumberOfTheProduct;
	

}
