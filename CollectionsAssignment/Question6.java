import java.util.*;

public class Question6 {
    public static void main(String[] args) {


        List<Integer> list1=new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(1);
        list1.add(3);
        list1.add(3);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(2);


        Map< Integer,Integer> hmp= new LinkedHashMap<>();
        for(int i=0;i < list1.size();i++)
        {

            if (hmp.containsKey(list1.get(i))) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                hmp.put(list1.get(i), hmp.get(list1.get(i)) + 1);
            }

            else
            {
                hmp.put(list1.get(i),1);
            }


        }


        for (Map.Entry entry : hmp.entrySet())
        {

            System.out.println("\t"+entry.getKey() + "\t\t\t" + entry.getValue());
        }






        Set<Map.Entry<Integer, Integer>> set = hmp.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);

        Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );


        for(Map.Entry<Integer, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }




    }
}
