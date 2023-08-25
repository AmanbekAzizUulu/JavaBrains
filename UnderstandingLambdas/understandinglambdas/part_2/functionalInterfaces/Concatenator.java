

package understandinglambdas.part_2.functionalInterfaces;


/**
 * This functional interface takes two strings and returns them concatenated
 * 
 * @author Amanbek
 */
@ FunctionalInterface
public interface Concatenator
{
    abstract String concatenate (String str_1, String str_2);


    default void info ()
    {
        System.out.println ("The 'Concatenator' functional interface takes two strings and returns them concatenated");
    }
}
