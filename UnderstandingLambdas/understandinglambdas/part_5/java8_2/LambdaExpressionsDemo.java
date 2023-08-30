
package understandinglambdas.part_5.java8_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		printConditionally (people, person -> true);

		// Step 3: create a method that prints all people that have last name beginning with 'C'
		System.out.println ("List of Persons with first name beginning with 'C':");
		printConditionally (people, person -> person.getFirstName ().startsWith ("C"));

		System.out.println ("List of Persons with last name beginning with 'C':");
		printConditionally (people, person -> person.getLastName ().startsWith ("C"));
	}

	private static void printConditionally (List <Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test (person)) {
				System.out.println (person);
			}
		}
	}

}
