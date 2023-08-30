
package understandinglambdas.part_9.method_reference_2;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


import understandinglambdas.part_5.java8_2.Person;


public class MethodReference {

	public static void main(String [] args) {
		List <Person> people = Arrays
		        .asList (
		                new Person ("Charles", "Dickens", 60),
		                new Person ("Lewis", "Carrol", 42),
		                new Person ("Thomas", "Carlyle", 51),
		                new Person ("Charlotte", "Bronte", 45),
		                new Person ("Matthew", "Arnold", 38)
		        );

		System.out.println ("List of Persons: ");
		performConditionally (people, person -> true, System.out::println);

	}


	private static void performConditionally(
	                                         List <Person> people,
	                                         Predicate <Person> predicate,
	                                         Consumer <Person> consumer) {
		for (Person person : people) {
			if (predicate.test (person)) {
				consumer.accept (person);
			}
		}
	}
}
