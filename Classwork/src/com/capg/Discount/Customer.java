package com.capg.Discount;

public class Customer 
{
	private String CutometrName;
	private boolean member=false;
	private String memberType;
	
	public Customer()
	{
		
	}

	public Customer(String cutometrName, boolean member, String memberType) {
		super();
		CutometrName = cutometrName;
		this.member = member;
		this.memberType = memberType;
	}

	public String getCutometrName() {
		return CutometrName;
	}

	public void setCutometrName(String cutometrName) {
		CutometrName = cutometrName;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
