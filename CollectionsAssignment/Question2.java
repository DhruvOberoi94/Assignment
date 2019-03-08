import java.util.HashSet;
import java.util.Iterator;

public class Question2 {


    public static void main(String[] args) {

        Boolean result;
        String inputstring="Alvei@wsomA";
        System.out.println(inputstring);
        HashSet< Character> uniquecharset= new HashSet<>();
        int count=0;
        for(int i=0;i < inputstring.length();i++)
        {
            result=uniquecharset.add(inputstring.charAt(i));
            if(result)
            {
                count++;

            }

        }


        System.out.println("the no. of unique characters is : "+count);

    }
}
