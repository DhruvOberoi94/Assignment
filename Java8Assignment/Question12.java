import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Question12
{

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 5, 4, 7, 8, 9, 10);

        Optional<Integer> result =  numbers.stream().filter(value -> value % 2 == 0).filter(e->e>3).findFirst();

        if(result.isPresent())
        {
            System.out.println(result.get());
        }

        else
        {
            System.out.println("no value");
        }
    }
}