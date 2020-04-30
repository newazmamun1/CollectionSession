package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList();
		
		//add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenum");
		ll.add("RPA");
		ll.add("RFT");
		
		//Print 
		System.out.println("Content of linkedlist :"+ll);
		
		//addfirst
		ll.addFirst("Naven");
		
		//addlast 
		ll.addLast("Naven Automation");
		
		System.out.println("Content of linkedlist :"+ll);
		
		//get 
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first & last element 
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of linkedlist :"+ll);
		
		// remove specific position 
		ll.remove(2);
		System.out.println("Content of linkedlist :"+ll);
		
		// how to print all the value of linkedList :
		// for loop
		// advance for loop
		// iterator
		// while loop
		
		
		// for loop
		System.out.println("using for loop");
		
		for(int n=0; n<ll.size();n++ ) {
			System.out.println(ll.get(n));
		}
		
		// advance for loop
		System.out.println("using for advance loop");
		
		for (String str : ll) {
			System.out.println(str);
			
		}
		
		// iterator
		System.out.println("iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// while loop
		System.out.println("while loop");
		
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
