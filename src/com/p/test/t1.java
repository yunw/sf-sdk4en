package com.p.test;

import java.util.*;
import java.io.*;

public class t1 {
	  public void samples() throws IOException{

          //1. 这是从键盘读入一行数据,返回的是一个字符串
		  BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));
		  System.out.print("Enter a line:");
		  System.out.println(stdin.readLine());
		  System.out.print(stdin.read());
		  PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("/home/irene/uddi-access.log")));
		  System.out.print(out1);
	  }
	  
	  public static void main(String[] args) throws Exception{
		  t1 T1 = new t1();
		  T1.samples();
	  }
	  
}
