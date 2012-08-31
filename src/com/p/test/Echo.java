package com.p.test;

/*打印前三行输入流
*/

import java.io.*;

public class Echo {

	  public static void main(String[] args) throws Exception {
	    BufferedReader in =
	      new BufferedReader(
	        new InputStreamReader(System.in));
	    String s;
	    int count;
	    for (count=0;count<3;count++){
//	    	try {
//	    		while((s = in.readLine()).length() != 0)
	    			System.out.println(in.readLine());
	      // An empty line terminates the program
//	    	} catch(IOException e) {
//	      e.printStackTrace();
//	    }
	    }
	  }
} 