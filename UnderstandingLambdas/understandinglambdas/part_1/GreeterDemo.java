package understandinglambdas.part_1;

public class GreeterDemo
{
    public static void main (String [] args)
    {
        Greeter greeter = new Greeter ();
        WorldGreeter worldGreeter = new WorldGreeter ();
        TownGreeter townGreeter = new TownGreeter ();
        
        greeter.greet (worldGreeter);
        greeter.greet (townGreeter);
         
    }
    
    

}
