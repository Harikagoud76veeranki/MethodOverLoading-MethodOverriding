package com.apj1;
//program to demonstrate method overloading using different parameters
public class MethodOverloadingDemo {
	
		//method with no parameters
		void area() {
			System.out.println("The method with no parameters");
		}
	
		//to find the area of rectangle with two parameters
		void area(float length,float breadth) {
			System.out.println("The area of rectangle= "+(length*breadth));	
		}
		
		//to print the area using characters 
		/*here the character represents the area 
		 * through the ascii value of an alphabet*/
		void area(char c1,char c2) {
			char c3;
			c3=(char)((int)c1+(int)c2);
			System.out.println("The area of given characters= "+c3);	
		}
		
		
		//to find the area of square with single parameter
		void area(int side) {
			System.out.println("The area of square= "+(side*side));	
		}
		
		//to find the area of trapezoid with three parameters
		void area(int base1,int base2,int height) {
			System.out.println("the area of trapezoid= "+(0.5*(base1+base2)*height));	
		}
		
		public static void main(String[] args) {
			 MethodOverloadingDemo m=new  MethodOverloadingDemo();
					 m.area();//o/p-no parameters
					 m.area(20);//o/p-400
					 m.area('a', 'c');
					 m.area(10.0f, 15.5f);//o/p-155.0
					 m.area(5, 7, 10);//o/p-60.0
		}

	

	
}
