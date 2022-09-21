package project.entity;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(voice, animal.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, voice);
    }

    @Override
    public String toString() {
        return "Animal{ " + "name= " + name + ", voice= " + voice + " }";
    }
}
