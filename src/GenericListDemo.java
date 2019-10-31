import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericListDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(); // List is mutable
        values.add(222);
        values.add(55);
        values.add(7);
//        values.add("kapi"); // it gives compile time error because of string type

        // sort AND unsort
        Collections.sort(values); // collection is a class and sort is a method name(which is Static method)
        Collections.reverse(values);

        for( Object o : values)
        {
            System.out.println(o);
        }
    }
}
