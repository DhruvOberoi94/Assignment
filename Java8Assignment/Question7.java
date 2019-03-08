interface Vehicle_New
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



class Car_New implements Vehicle_New
{

    private String brand;

    // constructors/getters

    Car_New(String brand)
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

}




public class Question7 {

    public static void main(String[] args) {
        Vehicle_New car_new = new Car_New("GINI");
        System.out.println(car_new.getBrand());
        System.out.println(car_new.speedUp());
        System.out.println(car_new.slowDown());
        System.out.println(car_new.turnAlarmOn());
        System.out.println(car_new.turnAlarmOff());
        System.out.println("hp is "+Vehicle_New.getHorsePower(400,500));
    }
}