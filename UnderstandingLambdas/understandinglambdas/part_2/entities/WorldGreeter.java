

package understandinglambdas.part_2.entities;


import understandinglambdas.part_2.functionalInterfaces.Greeting;



public class WorldGreeter implements Greeting
{
    @ Override
    public void perform ()
    {
        System.out.println ("Hello, World!");
    }

}
