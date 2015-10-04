package com.brillio.training.entity;

public class Television extends Product {

	private int size; // in inches
	private String screenType; // TFT, LCD, LED, CRT, Plasma, Projection
	
	public Television(){
	}

	public Television(int productId, String productName, double unitPrice, int size, String screenType) {
		super(productId, productName, unitPrice);
		this.size = size;
		this.screenType = screenType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	@Override
	public String toString() {
		return super.toString() + "Television [size=" + size + ", screenType=" + screenType + "]";
	}
	
	//this method overrides the inherited print() method
	//from the Product class. We use an annotation @Override
	//to inform the complier to check if it is really overriding
	@Override
	public void print(){
		System.out.println("Size        :"+size);
		System.out.println("Screentype  :"+screenType);
		super.print();
	}
	
}
