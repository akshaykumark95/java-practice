package com.yash.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class Test extends Thread{
	
	//logger
	static Logger logger=Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) {

		List<String> l=new ArrayList<>();
		l.add("Akshay");
		l.add("Akash");
		l.add("Nilesh");
		l.add("Nishant");
		l.add("Sagar");
		
		System.out.println(l);
		 
		
		//for each 
		for(String s : l)
		{
			//System.out.println(s);
			//l.remove(3); -> It throws concurrent modification exception bcoz we try to update the data while iterating
			logger.info(s);
		}
		
		//Iterator
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			//System.out.println(s);
			logger.info(s);
		}
		
		 l.add(1, "Shubham");
		
		 // System.out.println(l);
		 //Delete
		 l.remove(3);
		 System.out.println(l);
		 //update
		 l.set(0, "AK");
		 System.out.println(l);
		 
		 
	}
}
