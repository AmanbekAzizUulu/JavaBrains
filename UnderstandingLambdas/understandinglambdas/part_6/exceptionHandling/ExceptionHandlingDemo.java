package understandinglambdas.part_6.exceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingDemo {
	public static void main(String [] args) {
		int [] values = { 12, 24, 35, 46, 55, 62, 73, 107 };
		int	   key	  = 0;

		process (values, key, wrapperLambda ((v, k) -> System.out.println (v / k)));

	}

	private static void process(int [] values, int key, BiConsumer <Integer, Integer> consumer) {
		for (int element : values) {
			consumer.accept (element, key);
		}
	}

	private static BiConsumer <Integer, Integer> wrapperLambda(BiConsumer <Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept (v, k);
			} catch (ArithmeticException ae) {
				System.out.println ("Arithmetic Exception was catched in Wrapper Lambda: " + ae);
			}
		};
	}
}
