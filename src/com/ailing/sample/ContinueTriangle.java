package com.ailing.sample;
class ContinueTriangle{
	public static void main(String args[]){
		
		String strInput = "";
		
		try{
			
		strInput = args[0]; 
		System.out.println(strInput instanceof String);
		int input = Integer.parseInt(strInput);
		//int input = Integer.parseInt(args[0]);
		int target = 0;

		//if else same as ternary operator
		//if input number is greater than 10 set number as 10

		/*if(input >10){
			target = 10;
		}else{
			target = input;
		}*/

		//ternary operator must have return value
		target = (input > 10)? 10 : input;

		//triangle
		outer:for(int i = 0;i < target; i++){
			
			for(int j = 0; j < target; j++){
				if (j > i){
					System.out.println(" ");
					continue outer;
				}
				System.out.print(" " + (i * j));
			}
		}
		System.out.println();
		
		//Arithmetic
		
		int num = 10;
		int result = num / input;
		System.out.println("Result: " + result);
		
		}catch(NumberFormatException ex){
			System.out.println("I guess you did'n give me a number " + strInput);
			//ex.printStackTrace();
		}catch(ArithmeticException ex){
			System.out.println("Cannot give 0");
			//ex.printStackTrace();
		}catch(Exception ex){
			System.out.println("I dont'n know something is wrong");
			ex.printStackTrace();
		}finally{
			System.out.println("Finally it's done");
		}
	}
}