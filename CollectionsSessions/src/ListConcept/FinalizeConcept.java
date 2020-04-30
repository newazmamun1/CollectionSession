package ListConcept;

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("finalize method");
	}
	
	// finalize is Method 

	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		//garbage collector , just clean up non reference object before garbage collector 
		System.gc();
		
		
	}

}
