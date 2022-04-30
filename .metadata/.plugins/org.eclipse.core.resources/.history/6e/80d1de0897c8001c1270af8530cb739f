package CMV.StoreProject.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "product_stock_quantity")
	private int productStockQuantity;
	
	@Column(name = "product_name")
	private int productName;

	@Column(name = "product_price")
	private int productPrice;

	@Column(name = "product_brand")
	private String productBrand;

	@Column(name = "date_product_was_added")
	private int dateProductWasAdded;

	@Column(name = "product_expiry_date")
	private int productExpiryDate;

//	@Column(name = "category_name")
//	private String category_name;

	@Column(name = "serialNumberOfTheProduct")
	private String serialNumberOfTheProduct;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
	
	

	/*
	 * public Product() {}
	 * 
	 * public Product(int productStockQuantity, int productPrice, String
	 * productBrand, int dateProductWasAdded, int productExpiryDate, String
	 * categoryOfTheProduct, String serialNumberOfTheProduct) { super();
	 * this.productStockQuantity = productStockQuantity; this.productPrice =
	 * productPrice; this.productBrand = productBrand; this.dateProductWasAdded =
	 * dateProductWasAdded; this.productExpiryDate = productExpiryDate;
	 * this.categoryOfTheProduct = categoryOfTheProduct;
	 * this.serialNumberOfTheProduct = serialNumberOfTheProduct; }
	 * 
	 * public int getProductStockQuantity() { return productStockQuantity; }
	 * 
	 * public void setProductStockQuantity(int productStockQuantity) {
	 * this.productStockQuantity = productStockQuantity; }
	 * 
	 * public int getProductPrice() { return productPrice; }
	 * 
	 * public void setProductPrice(int productPrice) { this.productPrice =
	 * productPrice; }
	 * 
	 * public String getProductBrand() { return productBrand; }
	 * 
	 * public void setProductBrand(String productBrand) { this.productBrand =
	 * productBrand; }
	 * 
	 * public int getDateProductWasAdded() { return dateProductWasAdded; }
	 * 
	 * public void setDateProductWasAdded(int dateProductWasAdded) {
	 * this.dateProductWasAdded = dateProductWasAdded; }
	 * 
	 * public int getProductExpiryDate() { return productExpiryDate; }
	 * 
	 * public void setProductExpiryDate(int productExpiryDate) {
	 * this.productExpiryDate = productExpiryDate; }
	 * 
	 * public String getCategoryOfTheProduct() { return categoryOfTheProduct; }
	 * 
	 * public void setCategoryOfTheProduct(String categoryOfTheProduct) {
	 * this.categoryOfTheProduct = categoryOfTheProduct; }
	 * 
	 * public String getSerialNumberOfTheProduct() { return
	 * serialNumberOfTheProduct; }
	 * 
	 * public void setSerialNumberOfTheProduct(String serialNumberOfTheProduct) {
	 * this.serialNumberOfTheProduct = serialNumberOfTheProduct; }
	 */

}