

package understandinglambdas.part_4;


public class RunnableExample
{
    public static void main (String [] args)
    {
        Thread currentThread = new Thread (new Runnable ()
        {
            @ Override
            public void run ()
            {
                System.out.println ("Printed inside Runnable");
            }
        });
        currentThread.start ();

        Thread currentThread_viaLambda =
            new Thread ( () -> System.out.println ("Printed inside Runnable via Lambda Expression"));

        currentThread_viaLambda.start ();
    }
}
