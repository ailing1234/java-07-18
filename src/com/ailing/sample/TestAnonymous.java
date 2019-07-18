package com.ailing.sample;

public class TestAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInner obj = new AnonymousInner() {
			
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("Inside MyMethod");
			}
		};
		obj.myMethod();
	}

}
