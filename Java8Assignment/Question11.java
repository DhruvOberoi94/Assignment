import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Question11
{

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 5, 4, 7, 8, 9, 10);

        System.out.println(numbers.stream().collect(Collectors.averagingInt(e->e*2) ));

        System.out.println(numbers.stream().map(e->e*2).collect(Collectors.averagingInt(Integer::intValue) ));


    }
}