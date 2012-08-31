package com.p.test;
/*
 * Serializable for 		a = (Logon)in.readObject()?
 * currentTimeMillis?
 * 
 * */
import java.io.*;
import java.util.*;

public class Logon implements Serializable {
	Date today = new Date();
	{
		System.out.println("Loading Ojbects at " + today);
	}
	String id;
	transient String passwd;
	
	Logon(String usr, String pwd){
		usr = id;
		pwd = passwd;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Logon a = new Logon ("Irene","irene89");
		System.out.println("Logon as : " + a);
		ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("/home/irene/logon.out"));
		out.writeObject(a);
		out.close();
		
		int seconds = 5;
		long t = System.currentTimeMillis() + seconds*1000;
		System.out.println("Print current system time : " + System.currentTimeMillis());
		while (System.currentTimeMillis()<t);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("/home/irene/logon.out"));
		System.out.println("Recovering Object at " + new Date());
		a = (Logon)in.readObject();
		System.out.println("Logon a + " + a);
	}

}
