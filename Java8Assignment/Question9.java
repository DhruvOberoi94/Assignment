import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Question9 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);




        List<Integer> integerList = Arrays.asList(12, 15, 45, 23, 17, 18, 14, 16);
        System.out.println(integerList.stream().filter((e)-> e % 2==0).collect(Collectors.toList()));
    }
}