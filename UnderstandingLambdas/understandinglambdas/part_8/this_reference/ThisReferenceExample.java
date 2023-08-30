package understandinglambdas.part_8.this_reference;

public class ThisReferenceExample {
	public static void main(String [] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample ();

		thisReferenceExample.doProcess (10, new Processor () {
			@ Override
			public void process(int i) {
				System.out.println ("Value of 'i' is: " + i);
				System.out.println (this);
			}
		});

		/*	This code will not compile */
		
//		thisReferenceExample.doProcess (20, i -> {
//			System.out.println ("Value of 'i' is: " + i);
//			System.out.println (this);
//		});
		
		thisReferenceExample.execute ();
	}

	public void doProcess(int i, Processor p) {
		p.process (i);
	}

	public void execute() {
		// this => thisReferenceExample
		doProcess (20, i -> {
			System.out.println ("Value of 'i' is: " + i);
			System.out.println (this);
		});
	}

	@ FunctionalInterface
	interface Processor {
		void process(int i);
	}

	@ Override
	public String toString() {
		return "ThisReferenceExample [getClass()=" + getClass () + ", hashCode()=" + hashCode () + ", toString()="
		        + super.toString () + "]";
	}
	
	
}
