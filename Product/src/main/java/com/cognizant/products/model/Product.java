package com.cognizant.products.model;

public class Product {
	
	private String productID;
	private String title;
	private String nowPrice;
	private ColorSwatches colorSwatch; 
	private String priceLabel; 
	
	public Product() {}
	
	public Product(String prodID, String title, ColorSwatches colorSwatch, String nowPrice, String priceLabel) {
		this.setProductID(prodID);
		this.setTitle(title);
		this.setNowPrice(nowPrice);
		this.setPriceLabel(priceLabel); 
	
	}

	private void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice; 
	}

	private void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}

	private void setTitle(String title) {
		this.title = title;
		
	}

	private void setProductID(String prodID) {
		this.productID = prodID;
		
	}

	public String getProductID() {
		return productID;
	}

	public String getTitle() {
		return title;
	}

	public String getNowPrice() {
		return nowPrice;
	}

	public ColorSwatches getColorSwatch() {
		return colorSwatch;
	}

	public String getPriceLabel() {
		return priceLabel;
	}

}
