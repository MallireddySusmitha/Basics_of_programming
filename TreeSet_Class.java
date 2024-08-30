package javaprogram;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Class {

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();
		t.add(67);
		t.add(90);
		t.add(12);
		t.add(12);
		System.out.println(t);
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
