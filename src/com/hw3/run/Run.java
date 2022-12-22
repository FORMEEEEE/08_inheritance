package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run extends Product {

	public static void main(String[] args) {
		
		Product pr1 = new Product("Samsung","Galaxy S9","blue",960000);
		Product pr2 = new Product("LG","G6","Red",820000);
	
		System.out.println("생성한 첫 번째 객체의 값 : " +pr1.toString());
		System.out.println("생성한 두 번째 객체의 값 : " +pr2.toString());
		
		System.out.println("===============================================================");
		
		System.out.println("생성한 두 객체의 값이 같은가 : " + pr1.equals(pr2));
		
		System.out.println("===============================================================");
		
		System.out.println("첫 번째 객체의 해쉬코드 값 : " + pr1.hashCode());
		System.out.println("두 번째 객체의 해쉬코드 값 : " + pr2.hashCode());
		
		System.out.println("===============================================================");
		
		Product copy = pr1.clone(); 
		System.out.println("복제한 객체의 값 : " + copy.toString());
		
		System.out.println("===============================================================");
	
		System.out.println("첫 번째 객체와 복제 객체가 주소 값이 일치하는가 : " + (pr1.hashCode() == copy.hashCode()));
	     System.out.println("첫 번째 객체와 복제 객체의 필드 값이 일치하는가 : " + pr1.equals(copy));
		
	}

	
	
	
}
