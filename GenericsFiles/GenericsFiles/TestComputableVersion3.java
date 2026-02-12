
import java.util.function.Predicate;


public class TestComputableVersion3
{
    public static void main(String[] args)
    {
        printResult (x->x.equals("Hello world"));

    }
    
    public static void printResult(Predicate<String> compIn)
    { 
        System.out.println(compIn.test("Hello universe"));
    }
    
}

