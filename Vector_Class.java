package javaprogram;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Class
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(56);
		v.add("susmi");
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(true);
		v.add(67.0);
		System.out.println(v);
		Vector v1=new Vector();
		v1.add(67);
		v1.add(89);
		v1.add(67);
		Collections.sort(v1);
		System.out.println(v1);
		         Iterator i= v.iterator();
		         while(i.hasNext())
		         {
		        	 System.out.println(i.next());
		         }
		         System.out.println("list of iterator");
		                    ListIterator i1 =v.listIterator();
		                    while(i1.hasNext())
		                   {
		                   	 System.out.println(i1.next());
		                     }
		                     System.out.println("----");
		                     while(i1.hasPrevious())
		                     {
		                    	 System.out.println(i1.previous());
		                     }
		                     System.out.println("------");
		                                     Enumeration e= v.elements();
		                                     while(e.hasMoreElements())
		                                     {
		                                    	 System.out.println(e.nextElement());
		                                     }
	}
     
    
}
