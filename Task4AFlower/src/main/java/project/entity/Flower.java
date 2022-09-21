package project.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Flower {
    private Bud bud;
    private boolean sluggish;

    public Flower(Bud bud, boolean sluggish) {
        this.bud = bud;
        this.sluggish = sluggish;
    }

    public Bud getBud() {
        return bud;
    }

    public void setBud(Bud bud) {
        this.bud = bud;
    }

    public boolean isSluggish() {
        return sluggish;
    }

    public void setSluggish(boolean sluggish) {
        this.sluggish = sluggish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return sluggish == flower.sluggish && Objects.equals(bud, flower.bud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bud, sluggish);
    }

    @Override
    public String toString() {
        return "Flower{ " + "bud= " + bud + ", sluggish= " + sluggish + " }";
    }
}
