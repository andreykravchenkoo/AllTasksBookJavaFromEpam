package Task6;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        MySet mySet1 = new MySet(1, 2, 3);
        MySet mySet2 = new MySet(3, 4, 5, 6);

        System.out.println("Intersection: " + mySet1.intersect(mySet2));
        System.out.println("Union: " + mySet1.unify(mySet2));
    }
}
