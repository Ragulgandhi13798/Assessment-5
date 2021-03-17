package set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(95);
		t.add(4);
		t.add(100);
		
		Iterator <Integer> i = t.iterator();
		while(i.hasNext())
			{
			System.out.println(i.next());
			}
		
		for(Integer a : t)
		{
			System.out.println(a);
		}
		// TODO Auto-generated method stub

	}

}
