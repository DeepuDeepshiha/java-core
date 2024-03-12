package com.learning.core.day6;
import java.util.Map.Entry;
import java.util.HashMap;
public class D06P01 {
	public static void main(String[] args)
	{
		HashMap<String,Long> hm=new HashMap<String,Long>();
		PhoneBook p1=new PhoneBook("Amal",998787823);
		PhoneBook p2=new PhoneBook("Manvitha",937843978);
		PhoneBook p3=new PhoneBook("Joseph",788222113);
		PhoneBook p4=new PhoneBook("Smith",829389331);
		PhoneBook p5=new PhoneBook("Kathe",758469521);
		hm.put(p1.name, p1.phoneno);
		hm.put(p2.name, p2.phoneno);
		hm.put(p3.name, p3.phoneno);
		hm.put(p3.name, p3.phoneno);
		hm.put(p4.name, p4.phoneno);
		hm.put(p5.name, p5.phoneno);
		for(Entry<String,Long> e: hm.entrySet())
		{
			System.out.println(e+" ");
		}
		
	}
}
