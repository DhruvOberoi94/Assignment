import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Question8 {

    public static void main(String[] args) {
        Date date=new Date();

        SimpleDateFormat form=new SimpleDateFormat("dd-MMMM-yyyy");
        Calendar cal= Calendar.getInstance();

       // cal.set(2,2);
        cal.set(2016,2,21);
        System.out.println(form.format(cal.getTime()));


    }
}
