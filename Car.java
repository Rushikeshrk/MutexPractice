/**
 * Created by rushikesh on 7/20/2017.
 */
 class Car extends Vehicle
{
    String carNo;
    public Car(int tyreCount,String color,String carNo)
    {
        super(tyreCount,color);
        this.carNo=carNo;


    }
     public void run()
    {
        System.out.println("Car class");
    }


}
