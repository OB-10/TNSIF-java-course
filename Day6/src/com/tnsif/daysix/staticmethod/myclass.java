package com.tnsif.daysix.staticmethod;

public class myclass {

	private int section;   //non static varible or instance varible
	
	private static int srNo; // static or class variable 
	
	
	//static block
	static 
	{
		System.out.println("------Within Static block-----");
		srNo=1000;
	//	section=101;
	}
	//defalt constructor 
	public myclass() {
		
	System.out.println("----Within DFefault constructor ----");
	srNo++;
	section++;
	}
	@Override
	public String toString() {
		return "myclass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method 
	static void display()
	{
		//System.out.println("Section :"+ section);
		
		System.out.println("Serial no :"+srNo);
		
		
	}
	

	
}