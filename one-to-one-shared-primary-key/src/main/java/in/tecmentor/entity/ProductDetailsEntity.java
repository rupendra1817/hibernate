package in.tecmentor.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="product_details_mst")
public class ProductDetailsEntity {

	@Id
	@GenericGenerator(name = "product-id-generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "product"))
	@GeneratedValue(generator = "product-id-generator")
	private Long proDetailId;
	private String brandName;
	private Long productRating;
	private String address;
	private String city;
	private String state;
	private String country;
	private String pin;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private ProductEntity product;

	public Long getProDetailId() {
		return proDetailId;
	}

	public void setProDetailId(Long proDetailId) {
		this.proDetailId = proDetailId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getProductRating() {
		return productRating;
	}

	public void setProductRating(Long productRating) {
		this.productRating = productRating;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
}
