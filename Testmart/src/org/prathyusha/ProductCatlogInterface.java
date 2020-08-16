package org.prathyusha;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.prathyusha.model.Product;

@WebService(name = "TestMartCatlog", targetNamespace = "http://www.testmart.com")
public interface ProductCatlogInterface {

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name="Product")
	public abstract List<Product> getProductsv2(String category);

}