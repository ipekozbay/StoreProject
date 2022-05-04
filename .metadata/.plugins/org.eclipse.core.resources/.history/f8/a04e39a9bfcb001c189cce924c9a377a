package CMV.StoreProject.entities.concretes;

import java.util.Date;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import CMV.StoreProject.entities.dto.ProductCreateDto;
import CMV.StoreProject.entities.dto.ProductUpdateDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	public Product(ProductCreateDto productCreateDto) {
		
		this.productStockQuantity = productCreateDto.getProductStockQuantity();
		this.productName = productCreateDto.getProductName();
		this.productPrice = productCreateDto.getProductPrice();
		this.productBrand = productCreateDto.getProductBrand();
		this.dateProductWasAdded = productCreateDto.getDateProductWasAdded();
		this.productExpiryDate = productCreateDto.getProductExpiryDate();
		this.serialNumberOfTheProduct = productCreateDto.getSerialNumberOfTheProduct();	
	}
	
	public Product(ProductUpdateDto productUpdateDto) {
		
		this.productStockQuantity = productUpdateDto.getProductStockQuantity();
		this.productName = productUpdateDto.getProductName();
		this.productPrice = productUpdateDto.getProductPrice();
		this.productBrand = productUpdateDto.getProductBrand();
		this.dateProductWasAdded = productUpdateDto.getDateProductWasAdded();
		this.productExpiryDate = productUpdateDto.getProductExpiryDate();
		this.serialNumberOfTheProduct = productUpdateDto.getSerialNumberOfTheProduct();	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "product_stock_quantity")
	private int productStockQuantity;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_price")
	private int productPrice;

	@Column(name = "product_brand")
	private String productBrand;

	@Column(name = "date_product_was_added")
	private Date dateProductWasAdded;

	@Column(name = "product_expiry_date")
	private Date productExpiryDate;

//	@Column(name = "category_name")
//	private String category_name;

	@Column(name = "serial_number_of_the_product")
	private String serialNumberOfTheProduct;

	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;

	@ManyToOne()
	@JoinColumn(name = "brand_id", nullable = false)
	private Brand brand;


}