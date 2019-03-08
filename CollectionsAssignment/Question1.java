import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question1 {
    public static void main(String[] args) {
        List<Float> list1=new ArrayList<>();


        list1.add(123.45f);
        list1.add(223.45f);
        list1.add(323.45f);
        list1.add(423.45f);
        list1.add(523.45f);

        ListIterator<Float> litr1=list1.listIterator();

        float sum=0;
        while(litr1.hasNext())
        {
            sum+=litr1.next();
        }


        System.out.println("The sum of the elements of the list is "+sum);


    }
}
