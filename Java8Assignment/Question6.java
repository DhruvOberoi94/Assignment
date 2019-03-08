interface Vehicle
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



class Car implements Vehicle
{

    private String brand;

    // constructors/getters

    Car(String brand)
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
    public String slowDown() {
        return "The car is slowing down.";
    }
}




public class Question6 {

    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        System.out.println("hp is "+Vehicle.getHorsePower(400,500));
    }
}