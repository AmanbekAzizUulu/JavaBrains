

package understandinglambdas.part_3;


public class TypeInterfaceExample
{
    public static void main (String [] args)
    {
        StringLengthLambda str = s -> s.length ();
       
        System.out.println(str.stringLength ("Hello World!"));
    }
}
