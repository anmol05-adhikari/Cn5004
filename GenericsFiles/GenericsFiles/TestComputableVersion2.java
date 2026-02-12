
import java.util.function.Predicate;


public class TestComputableVersion2
{
    public static void main(String[] args)
    {
        printResult (x -> x > 5); //lambda expression 

    }
    
    public static void printResult(Predicate<Integer> compIn)
    { 
        System.out.println(compIn.test(35));
    }
    
}

