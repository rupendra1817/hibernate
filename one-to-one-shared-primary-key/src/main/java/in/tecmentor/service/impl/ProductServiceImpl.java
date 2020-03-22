package in.tecmentor.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tecmentor.entity.ProductDetailsEntity;
import in.tecmentor.entity.ProductEntity;
import in.tecmentor.model.Product;
import in.tecmentor.model.ProductDetails;
import in.tecmentor.repository.ProductRepository;
import in.tecmentor.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void saveOrUpdateProduct(Product product) {
		ProductEntity productEntity = new ProductEntity();
		ProductDetailsEntity productDetails = new ProductDetailsEntity();
		BeanUtils.copyProperties(product, productEntity);
		BeanUtils.copyProperties(product.getProductDetails(), productDetails);
		productEntity.setProductDetails(productDetails);
		productDetails.setProduct(productEntity);
		productRepository.save(productEntity);
	}

	@Override
	public List<Product> getAllProduct() {
		List<ProductEntity> productEntities = productRepository.findAll();
		List<Product> products = new ArrayList<Product>();
		Product product = null;
		ProductDetails productDetails = null;
		for (ProductEntity productEntity : productEntities) {
			product = new Product();
			productDetails = new ProductDetails();
			BeanUtils.copyProperties(productEntity, product);
			BeanUtils.copyProperties(productEntity.getProductDetails(), productDetails);
			product.setProductDetails(productDetails);
			products.add(product);
		}
		return products;
	}

	@Override
	public void deleteProduct(Long productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public Product getProductById(Long productId) {
		Optional<ProductEntity> optionalProduct = productRepository.findById(productId);
		Product product = new Product();
		ProductDetails productDetails = new ProductDetails();
		BeanUtils.copyProperties(optionalProduct.get(), product);
		BeanUtils.copyProperties(optionalProduct.get().getProductDetails(), productDetails);
		product.setProductDetails(productDetails);
		return product;
	}
	 
}
