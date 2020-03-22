package in.tecmentor.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_mst")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	private String productBarcode;
	private String productName;
	private Double price;
	private Long quantity;
	private Boolean isActive;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
	private ProductDetailsEntity productDetails;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ProductDetailsEntity getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetailsEntity productDetails) {
		this.productDetails = productDetails;
	}
}
