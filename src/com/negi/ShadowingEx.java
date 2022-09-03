package com.negi;

public class ShadowingEx {

	public static void main(String[] args) {
		B b = new B();
		b.printX(4.7f);
	}

}
// Shadowing or variable hiding
class A {
	public int x = 10;
}

class B extends A {
	public String x = "Enemy is the best";
	private int i = 8;

	public void printX(float x) {
		System.out.println("The value of X: " + x);
		System.out.println("The value of X this: " + this.x);
		System.out.println("The value of X super: " + super.x);
	}
	
}





