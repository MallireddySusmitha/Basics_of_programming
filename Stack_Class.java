package javaprogram;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_Class {

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.add(23);
		s.add(45);
		s.add(2);
		s.add(90);
		s.add(null);
		s.add(null);
		s.add(null);
		s.add(null);
		s.add(true);
		s.add("susmi");
		s.add(89.0);
		s.add(2);
		System.out.println(s);
		Stack s1=new Stack();
		s1.add(67);
		s1.add(8905);
		s1.add(12);
		System.out.println(s1);
		                  Iterator i= s1.iterator();
		                  while(i.hasNext())
		                  {
		                	  System.out.println(i.next());
		                  }
		                          ListIterator i1= s1.listIterator();
		                          while(i1.hasNext())
		                          {
		                        	  System.out.println(i1.next());
		                          }
		                          while(i1.hasPrevious())
		                          {
		                        	  System.out.println(i1.previous());
		                          }
		                          System.out.println("=================");
		                          Enumeration e=s1.elements();
		                          while(e.hasMoreElements())
		                          {
		                        	  System.out.println(e.nextElement());
		                          }
		
		

	}

}
