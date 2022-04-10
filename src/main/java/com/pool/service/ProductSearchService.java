package com.pool.service;

import java.util.List;

import com.pool.domine.Product;
import com.pool.model.CommonResponse;

public interface ProductSearchService {

	public CommonResponse createProductIndexBulk(List<Product> products);

	public CommonResponse createProductIndex(Product product);

	public List<Product> findByName(String name);

	public List<Product> findByNameContaining(String name);

	public List<Product> findByManufacturerAndCategory(String manufacturer, String category);

	public CommonResponse createProductIndexBulkIndexing(final List<Product> products);

	public String createProductIndexIndexing(Product product);

	public CommonResponse findProductsByBrandSearchingNativeQuery(String brandName);

	public CommonResponse findByProductNameSearchingStringQuery(String productName);

	public CommonResponse findByProductPriceSearchingCriteriaQuery(String productPrice);

	public List<Product> processSearchMultiFieldFuzzySearch(String query);

	public List<String> fetchSuggestionsWildcardSearch(String query);
}
