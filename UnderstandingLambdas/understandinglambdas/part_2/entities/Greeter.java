

package understandinglambdas.part_2.entities;


import understandinglambdas.part_2.functionalInterfaces.Greeting;



public class Greeter
{
    public void greet (Greeting greeter)
    {
        greeter.perform ();
    }
}
