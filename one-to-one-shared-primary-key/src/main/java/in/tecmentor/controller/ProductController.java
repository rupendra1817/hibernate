package in.tecmentor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.tecmentor.model.CustomResponse;
import in.tecmentor.model.Product;
import in.tecmentor.service.impl.ProductServiceImpl;

/**
 * The Class ProductController.
 */
@RestController
public class ProductController {

	/** The product service impl. */
	@Autowired
	private ProductServiceImpl productServiceImpl;

	/**
	 * Save product.
	 *
	 * @param product
	 *            the product
	 * @return the response entity
	 */
	@PostMapping(value = "/save-product")
	public ResponseEntity<CustomResponse> saveProduct(@RequestBody Product product) {
		ResponseEntity<CustomResponse> responseEntity = null;
		productServiceImpl.saveOrUpdateProduct(product);
		CustomResponse customResponse = new CustomResponse("Successfully saved.", "SUCCESS0001");
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;
	}

	/**
	 * Update product.
	 *
	 * @param product
	 *            the product
	 * @return the response entity
	 */
	@PutMapping(value = "/update-product")
	public ResponseEntity<CustomResponse> updateProduct(@RequestBody Product product) {
		ResponseEntity<CustomResponse> responseEntity = null;
		productServiceImpl.saveOrUpdateProduct(product);
		CustomResponse customResponse = new CustomResponse("Successfully updated.", "SUCCESS0002");
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;

	}

	/**
	 * Gets the all product.
	 *
	 * @return the all product
	 */
	@GetMapping(value = "/get-all-product")
	public ResponseEntity<CustomResponse> getAllProduct() {
		ResponseEntity<CustomResponse> responseEntity = null;
		List<Product> products = productServiceImpl.getAllProduct();
		CustomResponse customResponse = new CustomResponse(products, "Successfully retrieved.", "SUCCESS0003");
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;

	}

	/**
	 * Gets the product by id.
	 *
	 * @param productId
	 *            the product id
	 * @return the product by id
	 */
	@GetMapping(value = "/get-product-by-id/{productId}")
	public ResponseEntity<CustomResponse> getProductById(@PathVariable("productId") Long productId) {
		ResponseEntity<CustomResponse> responseEntity = null;
		Product product = productServiceImpl.getProductById(productId);
		CustomResponse customResponse = new CustomResponse(product, "Successfully retrieved.", "SUCCESS0004");
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;
	}

	/**
	 * Delete product.
	 *
	 * @param productId
	 *            the product id
	 * @return the response entity
	 */
	@DeleteMapping(value = "/delete-product/{productId}")
	public ResponseEntity<CustomResponse> deleteProduct(@PathVariable("productId") Long productId) {
		ResponseEntity<CustomResponse> responseEntity = null;
		productServiceImpl.deleteProduct(productId);
		CustomResponse customResponse = new CustomResponse("Successfully deleted.", "SUCCESS0005");
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;
	}
}
