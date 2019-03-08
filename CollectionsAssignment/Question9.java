import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Question9 {

    public static void main(String[] args) {
        Date date=new Date();
        // System.out.println(date.getDate());

        SimpleDateFormat form=new SimpleDateFormat("HH:mm:ss");

        Calendar cal= Calendar.getInstance();

        form.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println("Time according to Kolkata->Asia");
        System.out.println(form.format(cal.getTime()));


        form.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println("Time according to Los_Angeles->America");
        System.out.println(form.format(cal.getTime()));

//
//        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
//        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
//        String IST = df.format(today);
//        System.out.println("Date in Indian Timezone (IST) : " + IST);
//
//        //dispalying date on PST timezone
//        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
//        String PST = df.format(today);
//        System.out.println("Date in PST Timezone : " + PST);
//
//        Read more: http://www.java67.com/2012/12/how-to-display-date-in-multiple-timezone-java.html#ixzz5gMtXHRys










    }
}
