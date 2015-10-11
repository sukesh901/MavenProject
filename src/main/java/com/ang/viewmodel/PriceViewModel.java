package com.ang.viewmodel;

public class PriceViewModel {

	private int priceid;
	private int price;
	
	public PriceViewModel(){
		
	}
	
	public int getPriceid() {
		return priceid;
	}
	
	public PriceViewModel(int priceid , int price){
		this.price=price;
		this.priceid=priceid;
		
	}
	public void setPriceid(int priceid) {
		this.priceid = priceid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
