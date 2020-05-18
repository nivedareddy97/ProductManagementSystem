package com.capgemini.god.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productdata")
public class Product {
	
	@Id
	private int id;
	private double prize;
	private String colour;
	private String dimensions;
	private String specifications;
	private String manufacture;
	private int quantity;
	private String  productCatogery;
	private String productName;
	private int retailerId;
	public Product() {
		super();
	}
	public Product(int id, int prize, String colour, String dimensions, String specifications, String manufacture,
			int quantity, String productCatogery, String productName, int retailerId) {
		super();
		this.id = id;
		this.prize = prize;
		this.colour = colour;
		this.dimensions = dimensions;
		this.specifications = specifications;
		this.manufacture = manufacture;
		this.quantity = quantity;
		this.productCatogery = productCatogery;
		this.productName = productName;
		this.retailerId = retailerId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductCatogery() {
		return productCatogery;
	}
	public void setProductCatogery(String productCatogery) {
		this.productCatogery = productCatogery;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", prize=" + prize + ", colour=" + colour + ", dimensions=" + dimensions
				+ ", specifications=" + specifications + ", manufacture=" + manufacture + ", quantity=" + quantity
				+ ", productCatogery=" + productCatogery + ", productName=" + productName + ", retailerId=" + retailerId
				+ "]";
	}
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

 

}
