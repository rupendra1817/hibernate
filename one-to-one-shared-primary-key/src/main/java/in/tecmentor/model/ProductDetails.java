package in.tecmentor.model;

public class ProductDetails {
	private Long proDetailId;
	private String brandName;
	private Long productRating;
	private String address;
	private String city;
	private String state;
	private String country;
	private String pin;

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
}
