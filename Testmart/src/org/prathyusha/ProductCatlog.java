package org.prathyusha;

import java.util.List;

import javax.jws.WebService;

import org.prathyusha.business.ProductServiceImpl;
import org.prathyusha.model.Product;

@WebService(endpointInterface = "org.prathyusha.ProductCatlogInterface", portName = "TestMartCatlogPort", serviceName = "TestMartCatlogService")
public class ProductCatlog implements ProductCatlogInterface {
	ProductServiceImpl productService = new ProductServiceImpl();

	
	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();

	}

	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);

	}

	
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);

	}

}
