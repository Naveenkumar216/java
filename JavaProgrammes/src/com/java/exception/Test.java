package com.java.exception;

public class Test {

	public static void main(String[] args) {
		Test obj; 
				try {
					obj= new Test();	
			obj.main();
			
			System.out.println("try blok");
			int a =33/0;
			}
		catch (Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");	
		}
		System.out.println("block");
	}
	
	
public void main() {
	System.out.println("method block");
}

}
