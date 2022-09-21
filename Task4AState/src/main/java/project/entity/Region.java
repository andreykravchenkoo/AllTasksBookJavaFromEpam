package project.entity;

import java.util.Objects;

public class Region extends StateObject {
    private String regionalCenter;

    public Region(String name, int population, int are, String regionalCenter) {
        super(name, population, are);
        this.regionalCenter = regionalCenter;
    }

    public String getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(String regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Region region = (Region) o;
        return Objects.equals(regionalCenter, region.regionalCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), regionalCenter);
    }

    @Override
    public String toString() {
        return "Region{ " + "regionalCenter= " + regionalCenter + " }";
    }
}
