
package understandinglambdas.part_5.java8_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpressionsDemo {
	public static void main (String [] args) {
		List <Person> people = Arrays.asList (
		        new Person ("Charles", "Dickens", 60), new Person ("Lewis", "Carrol", 42),
		        new Person ("Thomas", "Carlyle", 51), new Person ("Charlotte", "Bronte", 45),
		        new Person ("Matthew", "Arnold", 38)
		);

		// Step 1: sort list by last name
		Collections.sort (people, (person_1, person_2) -> person_1.getLastName ().compareTo (person_2.getLastName ()));

		// Step 2: create a method that prints all elements in the list
		System.out.println ("List of Persons: ");
		performConditionally (people, person -> true, person -> System.out.println(person));

		// Step 3: create a method that prints all people that have last name beginning with 'C'
		System.out.println ("List of Persons with first name beginning with 'C':");
		performConditionally (people, person -> person.getFirstName ().startsWith ("C"), person -> System.out.println("\t" + person.getFirstName ()));

		System.out.println ("List of Persons with last name beginning with 'C':");
		performConditionally (people, person -> person.getLastName ().startsWith ("C"), person -> System.out.println(person));
	}

	private static void performConditionally (List <Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test (person)) {
				consumer.accept (person);
			}
		}
	}

}
