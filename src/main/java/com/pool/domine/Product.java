package com.pool.domine;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@Document(indexName = "productindex")
public class Product {
	@Id
	private String id;
	@Field(type = FieldType.Text, name = "name")
	private String name;

	@Field(type = FieldType.Double, name = "price")
	private Double price;

	@Field(type = FieldType.Integer, name = "quantity")
	private Integer quantity;

	@Field(type = FieldType.Keyword, name = "category")
	private String category;

	@Field(type = FieldType.Text, name = "desc")
	private String description;

	@Field(type = FieldType.Keyword, name = "manufacturer")
	private String manufacturer;

	public Product() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", category="
				+ category + ", description=" + description + ", manufacturer=" + manufacturer + "]";
	}

}
