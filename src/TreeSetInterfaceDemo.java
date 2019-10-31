
import java.util.Set;
import java.util.TreeSet;

public class TreeSetInterfaceDemo {
    public static void main(String[] args) {

        Set<Integer> values = new TreeSet<>();
        System.out.println(values.add(333));
        System.out.println(values.add(46));
        System.out.println(values.add(53));
        System.out.println(values.add(6));
        System.out.println(values.add(6));

        for(int i : values)
        {
            System.out.println(i); // it print the ascending order
        }
    }
}