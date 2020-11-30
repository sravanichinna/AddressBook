package com.java.AddressBook;

public class InformationInput {
	private String first;
	private String last;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void copy(InformationInput temp)
	{
		this.address=temp.address;
		this.first=temp.first;
		this.last=temp.last;
		this.city=temp.city;
		this.state=temp.state;
		this.zip=temp.zip;
		this.phone=temp.phone;
	}
	@Override
	public String toString() {
		return "InformationInput [first=" + first + ", last=" + last + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phone=" + phone + "]";
	}
	
	
		
	
	

}




