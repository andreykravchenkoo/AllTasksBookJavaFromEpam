package Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class RoadWayRepository {
    private TreeSet<RoadWay> roadWayTreeSet = new TreeSet<>();

    public RoadWayRepository() {
        this.roadWayTreeSet = roadWayTreeSet;
    }

    public TreeSet<RoadWay> getRoadWayTreeSet() {
        return roadWayTreeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoadWayRepository that = (RoadWayRepository) o;
        return Objects.equals(roadWayTreeSet, that.roadWayTreeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roadWayTreeSet);
    }

    @Override
    public String toString() {
        return "RoadWayRepository{" +
                "roadWayTreeSet=" + roadWayTreeSet +
                '}';
    }
}
