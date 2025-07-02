package com.tnsif.dayfor.secondpackage;

import com.tnsif.dayfor.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		
		
		//accessing different package class
		
		Base b1 = new Base();
		
		//private, default , protected and public 
		
		b1.methodPublic();
		b1.varPublic=34567;
		b1.methodPublic();

	}

}package com.tnsif.dayfor.secondpackage;

public class Executor {

}
