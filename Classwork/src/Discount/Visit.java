package com.capg.Discount;

import java.util.Date;

public class Visit {

    private String Customername;
    private Date date;
    private double serviceExpense;
    private double productExpense;

  

    public Visit(String customername, Date date, double serviceExpense, double productExpense) {
		super();
		Customername = customername;
		this.date = date;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}
    

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public double getServiceExpense() {
		return serviceExpense;
	}


	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}


	public double getProductExpense() {
		return productExpense;
	}


	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}


	public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));

    }

    @Override
    public String toString() {
        return "Visit{" +
                "Customername=" + name.getName() +
                ",  member=" + name.isMember() +
                ",  member type=" + name.getMemberType() +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}
}