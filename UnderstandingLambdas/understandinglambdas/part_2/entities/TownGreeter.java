
package understandinglambdas.part_2.entities;


import understandinglambdas.part_2.functionalInterfaces.Greeting;


public class TownGreeter implements Greeting {

	@ Override
	public void perform() {
		System.out.println ("Hello, Town!");
	}

}
