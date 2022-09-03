package com.negi;

public class IntializationBlock {

	public static void main(String[] args) {
		S a = new S("Enemy");
		S a1 = new S();
		
		final int sum = a.divide(31, 5);
		System.out.println(sum);
		
	}

}


class S {
	String name;
	static float pi;
	
	// to initialize instance members
	public S(String name) {
//		System.out.println("Hi");
		System.out.println("Inside Parameterized");
		this.name = name;
	}
	
	public S() {
//		System.out.println("Hi");
		System.out.println("Inside default");
	}
	
	public int divide(int a, int b) {
		if (a == 0) return a;
		if (b <= 0) return 0;
		
		return a / b;
	}
	
	// to initialize static members
	static {
		 pi = 3.14f;
	}
	
	// to share common code among all constructor to avoid code duplication.
	//It will copy in the first line of all the constructor.
	{
		System.out.println("Hi");
	}
	
}



