interface Vehicle_Old
{

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn()
    {
        return "Turning the vehicle alarm on.";
    }


    default String turnAlarmOff()
    {
        return "Turning the vehicle alarm off.";
    }



    static int getHorsePower(int rpm, int torque)
    {
        return (rpm * torque) / 5252;
    }

}




interface Alarm
{

    default String turnAlarmOn()
    {
        return "Turning the alarm on. on an explicit request";
    }

    default String turnAlarmOff()
    {
        return "Turning the alarm off. on an explicit request";
    }



}







class Car_Old implements Vehicle_Old, Alarm
{

    private String brand;

    // constructors/getters

    Car_Old(String brand)
    {
        this.brand=brand;
    }

    @Override
    public String getBrand()
    {
        return brand;
    }

    @Override
    public String speedUp()
    {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown()
    {
        return "The car is slowing down.";
    }

    @Override
    public String turnAlarmOff()
    {
//        return Vehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
        return "Paused while waiting to turn alarm off";
    }





    @Override
    public String turnAlarmOn()
    {
        return "calling Vehicle_Old's default\n"+Vehicle_Old.super.turnAlarmOn();
        //  + "\n then calling Alarm's default\n" + Alarm.super.turnAlarmOn();
    }







}




public class Question8 {

    public static void main(String[] args) {
        Vehicle_Old car_old = new Car_Old("GINI");
        System.out.println(car_old.getBrand());
        System.out.println(car_old.speedUp());
        System.out.println(car_old.slowDown());
        System.out.println(car_old.turnAlarmOn());
        System.out.println(car_old.turnAlarmOff());
        System.out.println("hp is "+Vehicle_Old.getHorsePower(400,500));

/*

        Alarm car=new Car_Old("Porsch");
        car.turnAlarmOn();
*/
    }
}