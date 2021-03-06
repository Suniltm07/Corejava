package com.capg.phonemanipulation;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	
	private List<Contact> phoneBook=new ArrayList<Contact>();

    
	public List<Contact> getPhoneBook() {
		return phoneBook;
	}
	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
		
	}
	public List<Contact> viewAllContacts(){
		return phoneBook;
	}
	public Contact viewContactGivenPhone(long phoneNumber) {
		Contact obj=new Contact();
        for(Contact obj1:phoneBook)
        {
            if(obj1.getPhoneNumber()==phoneNumber)
            {
                obj=obj1;
            }
        }
        return obj;
	}
	public boolean removeContact(long phoneNumber) {
		 boolean f=false;
	        for(Contact obj:phoneBook)
	        {
	            if(obj.getPhoneNumber()==phoneNumber)
	            {
	                f=true;
	                phoneBook.remove(obj);
	                break;
	            }
	        }
	        return f;
	}
}
