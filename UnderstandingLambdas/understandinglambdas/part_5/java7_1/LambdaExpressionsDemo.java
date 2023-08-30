
package understandinglambdas.part_5.java7_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionsDemo {
	public static void main (String [] args) {
		List <Person> people = Arrays.asList (
		        new Person ("Charles", "Dickens", 60), 
		        new Person ("Lewis", "Carrol", 42),
		        new Person ("Thomas", "Carlyle", 51), 
		        new Person ("Charlotte", "Bronte", 45),
		        new Person ("Matthew", "Arnold", 38)
		);
		
		// Step 1: sort list by last name
		Collections.sort (people, new Comparator <Person> () {
			@ Override
			public int compare (Person o1, Person o2) {
				return o1.getLastName ().compareTo (o2.getLastName ());
			}
		});
		
		// Step 2: create a method that prints all elements in the list
		System.out.println("List of Persons: ");
		printAllPersons (people);
		
		// Step 3: create a method that prints all people that have last namebeginning with 'C'
		System.out.println("List of Persons with last name beginning with 'C' ");
		printAllPersonWithLastName_C (people);
	}

	private static void printAllPersonWithLastName_C (List <Person> people) {
		for (Person person : people) {
			if (person.getLastName ().startsWith ("C")) {
				System.out.println (person);
			}
		}
	}

	public static void printAllPersons (List <Person> people) {
		for (Person person : people) {
			System.out.println (person);
		}
	}
}
