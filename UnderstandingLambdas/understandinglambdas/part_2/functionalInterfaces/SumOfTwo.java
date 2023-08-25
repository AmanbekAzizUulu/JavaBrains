

package understandinglambdas.part_2.functionalInterfaces;


/**
 * This functional interface takes two integers and returns their sum.
 * 
 * @author Amanbek
 */
@ FunctionalInterface
public interface SumOfTwo
{
    abstract int sum (int num_1, int num_2);


    default void info ()
    {
        System.out.println ("The 'SumOfTwo' functional interface takes two integers and returns their sum");
    }
}
