/**
 * Created by rushikesh on 7/20/2017.
 */
public class Bike extends Vehicle {
    String bikeNo;
    public Bike(int tyreCount,String color,String bikeNo)
    {
        super(tyreCount,color);
        this.bikeNo=bikeNo;

    }
    public void run()
    {
        System.out.println("Bike class");
    }
}
