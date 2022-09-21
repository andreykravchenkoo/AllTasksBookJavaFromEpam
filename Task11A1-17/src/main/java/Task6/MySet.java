package Task6;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MySet {
    private List<Integer> element;

    public MySet(Integer... elements) {
        this(Arrays.asList(elements));
    }

    private MySet(List<Integer> elements) {
        this.element = elements;
    }

    public MySet intersect(MySet other) {
        return new MySet(element.stream().filter(other.element::contains).collect(Collectors.toList()));
    }

    public MySet unify(MySet other) {
        return new MySet(Stream.concat(this.element.stream(), other.element.stream()).distinct().collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return "Elements: " + element;
    }
}
