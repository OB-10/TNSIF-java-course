package com.tnsif.association.hasa;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		address address=new address("XYZ", "Pune", "Maharashtra", "4110001");
	
	
		Person p=new Person("om", address);
		p.displayInfo();
		System.out.println(p);
	
	
	
	}

}