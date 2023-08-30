
package understandinglambdas.part_9.foreachIteration;


import java.util.Arrays;
import java.util.List;


import understandinglambdas.part_5.java8_2.Person;


public class ForEachIterationExample {

	public static void main(String [] args) {
		List <Person> people = Arrays
		                             .asList (
		                                      new Person ("Charles", "Dickens", 60),
		                                      new Person ("Lewis", "Carrol", 42),
		                                      new Person ("Thomas", "Carlyle", 51),
		                                      new Person ("Charlotte", "Bronte", 45),
		                                      new Person ("Matthew", "Arnold", 38)
		                             );

		System.out.println ("Using for-i loop: ");

		for (int i = 0; i < people.size (); i ++) {
			System.out.println (people.get (i));
		}

		System.out.println ("\nUsing for-each loop via method reference: ");

		people.forEach (System.out::println);

		System.out
		          .println ("\nUsing for-each loop via lambda: ");
		people
		      .forEach (person -> System.out.println (person));

		people
		      .stream ()
		      .filter (person -> person.getFirstName ().startsWith ("C"))
		      .forEach (System.out::println);

		System.out
		          .println (
		                    people
		                          .stream ()
		                          .filter (person -> person.getLastName ().startsWith ("C"))
		                          .count ()
		          );
	}
}
