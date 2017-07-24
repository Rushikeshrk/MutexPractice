/**
 * Created by rushikesh on 7/24/2017.
 */
/**
 * Created by rushikesh on 7/24/2017.
 */
public class Toy implements Item{
    static final int gstRate=18;
    String name;
    double prize;
    int quantity;
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


