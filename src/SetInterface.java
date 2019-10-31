import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {

        Set<Integer> values = new HashSet<>();
        System.out.println(values.add(399));
        System.out.println(values.add(45));
        System.out.println(values.add(50));
        System.out.println(values.add(6));
        System.out.println(values.add(6));

        for(int i : values)
        {
            System.out.println(i); // it is not following the sequences for fatching the values
        }
    }
}