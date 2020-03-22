package in.tecmentor.service;

import java.util.List;

import in.tecmentor.model.Product;

public interface ProductService {

	public void saveOrUpdateProduct(Product product);

	public List<Product> getAllProduct();

	public Product getProductById(Long productId);

	public void deleteProduct(Long productId);
}
