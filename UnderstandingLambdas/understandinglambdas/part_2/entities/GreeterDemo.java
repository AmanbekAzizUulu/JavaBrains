

package understandinglambdas.part_2.entities;


import understandinglambdas.part_2.functionalInterfaces.Concatenator;
import understandinglambdas.part_2.functionalInterfaces.Greeting;
import understandinglambdas.part_2.functionalInterfaces.MyLambda;
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

        /*
         * This is how you execute lambda expression. By calling the interface method on it, just as if it were an
         * instance of a class.
         */
        myLambdaFunction.foo ();

        System.out.println ("\tSum of two integers: " + summator.sum (25, 25));
        System.out.println ("\tConcatenated strings: '" + conn.concatenate ("Hello,", " World!" + "'"));

        Greeting greeting = new Greeting ()
        {
            @ Override
            public void perform ()
            {
                System.out.println ("Hello from inner anonymoous class!");
            }
        };
        greeting.perform ();
        
        
    }
}
