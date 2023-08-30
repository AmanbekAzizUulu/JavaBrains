
package understandinglambdas.part_9.method_reference_1;


public class MethodReference {

	public static void main(String [] args) {
		Thread thread_1 = new Thread (() -> printMesage ());
		thread_1.start ();

		Thread thread_2 = new Thread (MethodReference::printMesage);
		thread_2.start ();
	}


	public static void printMesage() {
		System.out.println ("Hello!");
	}
}
