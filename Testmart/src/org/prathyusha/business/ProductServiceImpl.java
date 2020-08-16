package org.prathyusha.business;

import java.util.ArrayList;
import java.util.List;

import org.prathyusha.model.Product;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Think and Grow Rich");
		bookList.add("The Secret");
		bookList.add("One Indian Girl");

		musicList.add("Gana music");
		musicList.add("Spotify");
		musicList.add("WynkMusic");

		movieList.add("Bahubhali");
		movieList.add("Sarileru neekuevaru");
		movieList.add("Mission Mangal");

	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("BOOKS");
		categories.add("MUSIC");
		categories.add("MOVIES");
		return categories;

	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;

		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
		case "music":
			musicList.add(product);
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;

		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Head First Java","123", 9999.9));
		productList.add(new Product("Data Structures","ABC", 99999.9));
		return productList;

	}
}
