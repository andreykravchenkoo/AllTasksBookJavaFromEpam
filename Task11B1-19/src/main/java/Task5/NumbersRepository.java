package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumbersRepository {
    private List<Integer> integers = new ArrayList<>();

    public NumbersRepository() {
        this.integers = integers;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumbersRepository that = (NumbersRepository) o;
        return Objects.equals(integers, that.integers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integers);
    }

    @Override
    public String toString() {
        return "NumbersRepository{" +
                "integers=" + integers +
                '}';
    }
}
