import java.util.Scanner;

abstract class Polygon{
  double angle;
     int sides;

    abstract void getAngle();
    abstract  void getSides();

//    public void (int units){
//        System.out.println(units*rate);
//    }

//    public void polygonDetails()
//    {
//        System.out.println("");
//    }
}



class Concave extends Polygon
{
    public void getAngle()
    {
        angle=190.0;
        System.out.println("max angle inside the polygon "+angle);

    }

    public void getSides()
    {
        sides=4;
        System.out.println("no. of sides of the polgyon "+sides);
    }

}



class Convex extends Polygon
{
    public void getAngle()
    {
        angle=170.0;
        System.out.println("max angle inside the polygon "+angle);

    }

    public void getSides()
    {
        sides=6;
        System.out.println("no. of sides of the polgyon "+sides);
    }

}


class GetPolygonFactory
{
     Polygon getPolygon(String polygonType)
    {
        if(polygonType==null)
        {
            return null;
        }

        else if (polygonType.equalsIgnoreCase("concave"))
        {
            return new Concave();
        }

        else if(polygonType.equalsIgnoreCase("convex"))
        {
            return new Convex();
        }
        return null;
    }
}





public class FactoryPattern {
    public static void main(String[] args) {
        GetPolygonFactory getPolygonFactory=new GetPolygonFactory();

        System.out.println("Enter the polygon type");
        Scanner in=new Scanner(System.in);
        String polygonName=in.next();

        Polygon polygon=getPolygonFactory.getPolygon(polygonName);

        System.out.println("Details for polygon of your choice :: ");
        polygon.getAngle();
        polygon.getSides();
    }
}
