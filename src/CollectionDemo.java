import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(500);
        values.add(1);
        values.add(3);
        System.out.println(values);

        Iterator it = values.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext()); // hasnext() is an method which check there is next element or not
        System.out.println(it.next()); // it gives an error

    }
}
