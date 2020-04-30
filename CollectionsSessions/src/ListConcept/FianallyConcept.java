package ListConcept;

public class FianallyConcept {

	public static void main(String[] args) {
		//test1();
		
		//test2();
		division();

	}
	
	//finally is block 
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("Test");
			
		} catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		
	}

	//
	public static void test2() {
		try {
			System.out.println("inside test 2");
		}
		finally {
			System.out.println("Fianally code in test 2 method");
		}
		
		
		// 
		public static void division (){
			int i = 10;
			try {
				System.out.println("inside try block");
				int k = i/0;
			}
			//catch(ArithmeticException e) {
			catch(NullPointerException e) {
				System.out.println("Inside catch block ");
				System.out.println("divide by zero error");
			}
			
			finally {
				System.out.println("Exucute this code even after exception ");
			}
			
		}
	
}
