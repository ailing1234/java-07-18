package com.ailing.sample;

public class TestClass implements Inf2 {

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		//return null;
		return "I am TestClass";
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		System.out.println("Test It");

	}

	public static void main(String args[])
	{
		System.out.println("Inside TestClass main");
		System.out.println(name);
		//name = "New Name";
		TestClass test = new TestClass();
		test.testIt();
		
		//not a correct way, refer line 29
		System.out.println(test.name);
		
		//correct way is using class name ,not object name
		System.out.println(Inf2.name);
		//testIt();//incorrect
		
		/*Inf1 obj = new TestClass();
		 
		System.out.println(obj.whoAmI());*/
		
		//System.out.println(obj.);//incorrect
		
		Inf2 obj = new TestClass();
		
		System.out.println(obj.whoAmI());
		obj.testIt();
	}
}
