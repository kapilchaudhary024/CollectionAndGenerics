import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class stud implements Comparable<stud>
{
    int rollno , marks;
    String name ;

    public stud(int rollno, String name, int marks )
    {
        super();
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Stud[rollno=" + rollno + " ,marks= " + marks + ", name= " + name + "]";
    }

    public int compareTo(stud s) {
        return marks>s.marks? 1 : -1;
    }
}


public class ComparatorInterface {
    public static void main(String[] args) {
        List<stud> studs = new ArrayList<>();

        studs.add(new stud(13, "kapil", 22));
        studs.add(new stud(1, "akash", 11));
        studs.add(new stud(19, "manish", 33));

        Collections.sort(studs);
        for(stud s : studs)
        {
            System.out.println(s);
        }
    }

}
