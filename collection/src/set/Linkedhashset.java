package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<Employee> lh = new LinkedHashSet<Employee>();
		
		Employee e1 = new Employee (1,"Ragul","chandran");
		Employee e2 = new Employee (2,"Ram","sam");
		Employee e3 = new Employee (3,"Raja","Ajith");
		
		lh.add(e1);
		lh.add(e2);
		lh.add(e3);
		
		Iterator <Employee> i = lh.iterator();
		while(i.hasNext())
			{
			System.out.println(i.next());
			}
		
		
	
	}

}
 class Employee
 {
	 int id;
	 String name;
	 String teammanager;
	 
	public Employee(int id, String name, String teammanager)
	{
		super();
		this.id = id;
		this.name = name;
		this.teammanager = teammanager;
	}
 }