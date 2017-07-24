/**
 * Created by rushikesh on 7/24/2017.
 */
public class BillingCounter {

    public static Cloth clothScanner(String name,double prize,int quantity)
    {
        return new Cloth(name,prize,quantity);

    }
    public static Toy toyScanner(String name,double prize,int quantity)
    {
        return new Toy(name,prize,quantity);

    }

    public static void main(String args[])
    {
        Cloth c = clothScanner("Shirt Denim",1388,2);

        Toy t = toyScanner("Teddy Bear",500,2);

        double clothGst=c.getGst();
        double toyGst=t.getGst();

         System.out.println("ClothGst:-"+clothGst);
         System.out.println("Toy Gst:-"+toyGst);

    }
}
