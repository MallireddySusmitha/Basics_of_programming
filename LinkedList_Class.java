package javaprogram;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Class {

	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(89);
		l.add(79);
		l.add(79);
		l.add("susmi");
		l.add(9.0);
		l.add(null);
		l.add(null);
		l.add(null);
		l.add(true);
		System.out.println(l);
		LinkedList l1=new LinkedList();
		l1.add("Rice");
		l1.addAll(l);
		System.out.println(l1);
		LinkedList l2=new LinkedList();
		l2.add(77);
		l2.add(56);
		l2.add(34);
		Collections.sort(l2);
		System.out.println(l2);
		Iterator i=l2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ListIterator i1=l2.listIterator();
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
