import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator; // we can also used iterator but it is not good
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List values = new ArrayList();
        values.add(500); // this is not int=500 this is Integer=500 which is wrapper class
        values.add(1);
        values.add(3);
        values.add(2,200);
        values.add("KAPIL"); // because of wrapper class it take object type
        System.out.println(values);

        for(int i=0; i<values.size(); i++)
        {
            System.out.println(values.get(i));
        }

        for( Object o : values)
        {
            System.out.println(o);
        }
    }
}