package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; // static array --size is fixed 
		
		//dynamic array --ArrayList
		// 1. Can contain duplicate /elements 
		// 2. maintain insertion order 
		// 3. Its not synchronize 
		// 4. Allows random access to fetch the elements because it store the value on the basis of index
		
		ArrayList ar = new ArrayList();
		ar.add(10); //0 position 
		ar.add(20); //1 position 
		ar.add(30); //3 position 
		
		System.out.println(ar.size());
		
		ar.add(40); //3 position 
		ar.add(50);  // 4 position
		ar.add(50); //5th postion 
		ar.add(12.33);
		ar.add("tset");
		ar.add("a");
		ar.add(true);
		
		System.out.println(ar.size()); // size of array
		
		System.out.println(ar.get(4)); // to get the value from an index 
		
		// to print all the values from array list :
		// 1. for loop  
		// 2. using iterator
		
		for(int i = 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic :
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		System.out.println(100);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("tset");
		ar2.add("selenium");
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//how to create store specific user define object in this particular array list 
		// Ans: Create User define class (Employee) ,simple create constructor with there variable 
		// and the store the value array this array list object with the help the Iterator 
		// we have to use & print all value, traverse  with this three different object .
		
		// Employee class Object :
		
		Employee e1 = new Employee("Naven",27,"QA");
		Employee e2 = new Employee("Tom",28,"Dev");
		Employee e3 = new Employee("Peter",29,"Admin");
		
		//create array list :
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// iterator to traverse the values
		
		Iterator<Employee> it =ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("***********");
		
		//***********************
		
		// addAll()
	
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("tset");
		ar5.add("selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("JaveScript");
		
		ar5.addAll(ar6);
		
		for (int i = 0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));
			
		}
		
		System.out.println("***********");
		
		//removeAll
		
		ar5.removeAll(ar6);
		for (int i = 0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));	
		
		}	
		System.out.println("***********");
		// retainlAll
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("Java");
		ar8.add("JaveScript");
		
		ar7.retainAll(ar8);
		for (int i = 0; i<ar7.size();i++) {
			System.out.println(ar5.get(i));	
		
		
		}
		

	}

}
