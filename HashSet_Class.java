package javaprogram;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Class {

	public static void main(String[] args)
	{
		HashSet h=new HashSet();
		h.add(78);
		h.add(78);
		h.add("susmi");
		h.add(true);
		h.add(null);
		h.add(null);
		h.add(null);
		h.add(null);
		h.add(908.0);
		h.add('b');
		System.out.println(h);
		HashSet h1=new HashSet();
		h1.add(678);
		h1.add(67);
		h1.add(67);
		h1.add(54);
		System.out.println(h1);
		Iterator i=h1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
