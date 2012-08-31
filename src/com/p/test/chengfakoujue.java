package com.p.test;

/*
 * 9*9 Multiplication chart 
 */

public class chengfakoujue {
	public static void main(String[] args){
		chengfakoujue t = new chengfakoujue();
		t.tests();
		
	}
	
	void tests(){
		for (int i=1; i<=9; i++){
			for (int j=1; j<=i; j++){
				System.out.print(j + "*" + i + "  ");
				}
			System.out.print("\n");
		}
	}
}

