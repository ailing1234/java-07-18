package com.ailing.sample;

public class My_class {
	
	public void displayMessage(Message m){
		System.out.println(m.greet());
	}

	public static void main(String args[]){
		//Instantiating the outer class
		Outer_Class outer = new Outer_Class();
		
		
		//Accessing the display_Inner() method
		outer.display_Inner();
		
		Outer_Class.Inner_Class2 inner = outer.new Inner_Class2();
		inner.print();
		
		//Pass anonymous inner class as a parameter
		My_class obj = new My_class();
		obj.displayMessage(new Message() {
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hi";
			}
		});
		
	}
}
