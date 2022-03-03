package com.capg.Discount;

public class DiscountRate
{
  double serviceDiscountPremium=0.2;
  double serviceDiscountGold=0.15;
  double serviceDiscountSilver=0.1;
  double productDiscountGold=0.1;
  double productDiscountSilver=0.1;
public DiscountRate(double serviceDiscountPremium, double serviceDiscountGold, double serviceDiscountSilver,
		double productDiscountGold, double productDiscountSilver) {
	super();
	this.serviceDiscountPremium = serviceDiscountPremium;
	this.serviceDiscountGold = serviceDiscountGold;
	this.serviceDiscountSilver = serviceDiscountSilver;
	this.productDiscountGold = productDiscountGold;
	this.productDiscountSilver = productDiscountSilver;
}
public double getServiceDiscountPremium() {
	return serviceDiscountPremium;
}
public void setServiceDiscountPremium(double serviceDiscountPremium) {
	this.serviceDiscountPremium = serviceDiscountPremium;
}
public double getServiceDiscountGold() {
	return serviceDiscountGold;
}
public void setServiceDiscountGold(double serviceDiscountGold) {
	this.serviceDiscountGold = serviceDiscountGold;
}
public double getServiceDiscountSilver() {
	return serviceDiscountSilver;
}
public void setServiceDiscountSilver(double serviceDiscountSilver) {
	this.serviceDiscountSilver = serviceDiscountSilver;
}
public double getProductDiscountGold() {
	return productDiscountGold;
}
public void setProductDiscountGold(double productDiscountGold) {
	this.productDiscountGold = productDiscountGold;
}
public double getProductDiscountSilver() {
	return productDiscountSilver;
}
public void setProductDiscountSilver(double productDiscountSilver) {
	this.productDiscountSilver = productDiscountSilver;
}
public static double getServiceDiscountRate(String memberType) {
	// TODO Auto-generated method stub
	return 0;
}
  
  
  

}
