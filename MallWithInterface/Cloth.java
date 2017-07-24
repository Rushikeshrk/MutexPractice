/**
 * Created by rushikesh on 7/24/2017.
 */
public class Cloth implements Item{
    static final int gstRate=12;
    String name;
    double prize;
    int quantity;
    Cloth(String name,double prize,int quantity)
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

