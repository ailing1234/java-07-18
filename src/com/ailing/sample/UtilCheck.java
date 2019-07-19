package com.ailing.sample;

import java.util.*;

public class UtilCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * **Non Generic ** 
		 * List list = new ArrayList(); 
		 * //list.add("hello");
		 * //list.add(new FinalClass());
		 * String s = (String) list.get(0);
		 */

		/** Generic **/
		List<String> list = new ArrayList<String>();

		// list.add(new FinalClass());
		list.add("hello");
		list.add("I");
		list.add("Java");
		list.add("ArrayList");

		// String s = list.get(0);

		/*for (String s : list)
			//System.out.println("I got :" + s);
			System.out.print(s + " ");*/
		
		/*Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
			
		}*/
		
		for(Iterator<?> it = list.iterator();it.hasNext();){
			
			String s = (String) it.next();
			if(s.equals("hello")){
				System.out.println("I got: " + s);
			}
			
		}

	}

}
