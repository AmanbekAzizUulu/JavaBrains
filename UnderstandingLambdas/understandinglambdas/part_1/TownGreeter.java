package understandinglambdas.part_1;

public class TownGreeter implements Greeting
{
    @ Override
    public void perform ()
    {
        System.out.println("Hello, Town!");
    }

}
