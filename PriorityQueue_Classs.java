package javaprogram;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Classs {

	public static void main(String[] args)
	{
		PriorityQueue a=new PriorityQueue();
		a.add(77);
		a.add(56);
		a.add(56);
		a.add(45);
		a.add(1);
		a.add(43);
		System.out.println(a);
     Iterator i=		a.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next());
     }
		

	}

}
