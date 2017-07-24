/**
 * Created by rushikesh on 7/24/2017.
 */
/**
 * Created by rushikesh on 7/24/2017.
 */
public class Toy extends Item{
    static final int gstRate=18;
    Toy(String name,double prize,int quantity)
    {
        this.name=name;
        this.prize=prize;
        this.quantity=quantity;

    }


    public double getGst()
    {
        double gst=(prize*gstRate/100)*quantity;
        return gst;
    }

}


