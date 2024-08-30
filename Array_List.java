package javaprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(90);
		a.add(89);
		a.add(78.0);
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(true);
		a.add(false);
		a.add("susmi");
		a.add('c');
		System.out.println(a);
		ArrayList a1=new ArrayList();
		a1.add(67);
		a1.add("reddy");
		a1.addAll(a);
		System.out.println(a1);
		System.out.println(a.equals(a1));
		System.out.println(a1.isEmpty());
		ArrayList a2=new ArrayList();
		System.out.println(a2.isEmpty());
		a2.add("susmitha");
		System.out.println(a2);
		a2.clear();
		System.out.println(a2);
		a1.remove("reddy");
		System.out.println(a1);
		a2.removeAll(a);
		System.out.println(a2);
		System.out.println(a1);
		ArrayList a3=new ArrayList();
		a3.add(99);
		a3.add(89);
		a3.add(83);
		a3.add(89);
		Collections.sort(a3);
		System.out.println(a3);
		            Iterator i=         a3.iterator();
		            while(i.hasNext())
		            {
		            	System.out.println(i.next());
		            }
		        ListIterator i1=    a3.listIterator();
		        while(i1.hasNext())
		        {
		        	System.out.println(i1.next());
		        }
		        	while(i1.hasPrevious())
		        	{
		        		System.out.println(i1.previous());
		        	}

	}

}
