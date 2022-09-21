package Task1;

import java.util.ArrayList;
import java.util.LinkedList;

public class PersonService {

    public static void timeArrayList() {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person(1));
        arrayList.add(new Person(2));
        arrayList.add(new Person(3));
        arrayList.add(new Person(4));
        arrayList.add(new Person(5));
        arrayList.add(new Person(6));
        arrayList.add(new Person(7));
        arrayList.add(new Person(8));
        arrayList.add(new Person(9));
        arrayList.add(new Person(10));

        while (arrayList.size() > 1) {
            for (int i = 0; i < arrayList.size(); i++) {
                if ((i & 2) == 1) {
                    arrayList.remove(i);
                }
            }
        }
    }

    public static void timeLinkedList() {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person(1));
        linkedList.add(new Person(2));
        linkedList.add(new Person(3));
        linkedList.add(new Person(4));
        linkedList.add(new Person(5));
        linkedList.add(new Person(6));
        linkedList.add(new Person(7));
        linkedList.add(new Person(8));
        linkedList.add(new Person(9));
        linkedList.add(new Person(10));

        while (linkedList.size() > 1) {
            for (int i = 0; i < linkedList.size(); i++) {
                if ((i & 2) == 1) {
                    linkedList.remove(i);
                }
            }
        }

        System.out.println(linkedList);
    }
}
