import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Question3 {


    public static void main(String[] args) {
        String inputstring="Alvei@wsomA";
        System.out.println(inputstring);
        HashMap< Character,Integer> countcharmap= new HashMap<>();
        for(int i=0;i < inputstring.length();i++)
        {

            if (countcharmap.containsKey(inputstring.charAt(i))) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                countcharmap.put(inputstring.charAt(i), countcharmap.get(inputstring.charAt(i)) + 1);
            }

            else
            {
                countcharmap.put(inputstring.charAt(i),1);
            }


        }


        System.out.println("Characters"+"\t"+"Respective no. of Occurrence");

        for (Map.Entry entry : countcharmap.entrySet())
        {

            System.out.println("\t"+entry.getKey() + "\t\t\t" + entry.getValue());
        }
    }


}

