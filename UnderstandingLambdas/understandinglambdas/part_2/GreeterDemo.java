

package understandinglambdas.part_2;


import understandinglambdas.part_2.functionalInterfaces.Concatenator;
import understandinglambdas.part_2.functionalInterfaces.SumOfTwo;



public class GreeterDemo
{
    public static void main (String [] args)
    {
        Greeter      greeter      = new Greeter ();
        WorldGreeter worldGreeter = new WorldGreeter ();
        TownGreeter  townGreeter  = new TownGreeter ();

        greeter.greet (worldGreeter);
        greeter.greet (townGreeter);

        MyLambda     myLambdaFunction = () -> System.out.println ("Hello from MyLambda!");


        SumOfTwo     summator         = (num_1, num_2) -> num_1 + num_2;
        Concatenator conn             = (str_1, str_2) -> str_1 + str_2;

        
        conn.info ();
        summator.info ();
        
        
    }

}



@ FunctionalInterface
interface MyLambda
{
    void foo ();
}

