package com.pool.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pool.domine.Product;
import com.pool.model.CommonResponse;
import com.pool.service.ProductSearchService;

@RestController
public class ElasticSearchContoller {

	@Autowired
	private ProductSearchService productSearchService;

	@PostMapping("/savebulkdata")
	public CommonResponse createProductIndexBulk(@RequestBody List<Product> products) {
		return productSearchService.createProductIndexBulk(products);
	}

	@PostMapping("/saveproduct")
	public CommonResponse createProductIndex(@RequestBody Product product) {
		return productSearchService.createProductIndex(product);
	}

	@PostMapping("/savebulkdataindes")
	public CommonResponse createProductIndexBulkIndex(@RequestBody List<Product> products) {
		return productSearchService.createProductIndexBulkIndexing(products);
	}

	@GetMapping("/findByName/{name}")
	public List<Product> findByName(@PathVariable("name") String name) {
		return productSearchService.findByName(name);
	}

	@GetMapping("/findByNameContaining/{name}")
	public List<Product> findByNameContaining(@PathVariable("name") String name) {
		return productSearchService.findByNameContaining(name);
	}

	@GetMapping("/findByManufacturerAndCategory/{manufacturer}/{category}")
	public List<Product> findByManufacturerAndCategory(@PathVariable("manufacturer") String manufacturer,
			@PathVariable("category") String category) {
		return productSearchService.findByManufacturerAndCategory(manufacturer, category);
	}

	@PostMapping("/createProductIndexIndexing")
	public String createProductIndexIndexing(@RequestBody Product product) {
		return productSearchService.createProductIndexIndexing(product);
	}

	@GetMapping("/findProductsByBrandSearchingNativeQuery/{brandName}")
	public CommonResponse findProductsByBrandSearchingNativeQuery(@PathVariable("brandName") String brandName) {
		return productSearchService.findProductsByBrandSearchingNativeQuery(brandName);
	}

	@GetMapping("/findByProductNameSearchingStringQuery/{productName}")
	public CommonResponse findByProductNameSearchingStringQuery(@PathVariable("productName") String productName) {
		return productSearchService.findByProductNameSearchingStringQuery(productName);
	}

	@GetMapping("/findByProductPriceSearchingCriteriaQuery/{productPrice}")
	public CommonResponse findByProductPriceSearchingCriteriaQuery(@PathVariable("productPrice") String productPrice) {
		return productSearchService.findByProductPriceSearchingCriteriaQuery(productPrice);
	}

	@GetMapping("/processSearchMultiFieldFuzzySearch/{query}")
	public List<Product> processSearchMultiFieldFuzzySearch(@PathVariable("query") String query) {
		return productSearchService.processSearchMultiFieldFuzzySearch(query);
	}

	@GetMapping("/fetchSuggestionsWildcardSearch/{query}")
	public List<String> fetchSuggestionsWildcardSearch(@PathVariable("query") String query) {
		return productSearchService.fetchSuggestionsWildcardSearch(query);
	}
}
