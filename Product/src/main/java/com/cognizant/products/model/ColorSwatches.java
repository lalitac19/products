package com.cognizant.products.model;

import java.util.ArrayList;
import java.util.List;

public class ColorSwatches {

	private String color; 
	private String rgbColor;
	private String skuID;
	
	List <ColorSwatches> colorSwatch = new ArrayList<ColorSwatches>();
	
	
	public ColorSwatches () {}
	
	public ColorSwatches(String color, String rgdColor, String skuID) {
		this.setColor(color);
		this.setRgbColor(rgdColor);
		this.setSkuID(skuID);
		
	}
	

	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRgbColor() {
		return rgbColor;
	}
	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
	}
	public String getSkuID() {
		return skuID;
	}
	public void setSkuID(String skuID) {
		this.skuID = skuID;
	} 
	
	
}
