package com.ailing.sample;

public class Outer_Class {

	int num;
	
	//inner class
	private class Inner_Class{
		public void print(){
			System.out.println("This is an inner class.");
		}
	}
	
	//inner class2
		public class Inner_Class2{
			public void print(){
				System.out.println("This is an inner class 2.");
			}
		}
		
		//local-member inner class3
		void myMethod(){
			class Inner_Class3{
					public void print(){
						System.out.println("This is an inner class 3 inside my method.");
					}
					
					Inner_Class3 inner = new Inner_Class3();
				
				}
		}
	//Accessing he inner class from the method within
	void display_Inner(){
		Inner_Class inner = new Inner_Class();
		inner.print();
	}
}
