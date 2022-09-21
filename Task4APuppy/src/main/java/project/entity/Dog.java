package project.entity;

public class Dog extends Animal {
    private boolean jump;
    private boolean run;
    private boolean bite;

    public Dog(String name, String voice, boolean jump, boolean run, boolean bite) {
        super(name, voice);
        this.jump = jump;
        this.run = run;
        this.bite = bite;
    }

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public boolean isBite() {
        return bite;
    }

    public void setBite(boolean bite) {
        this.bite = bite;
    }

    @Override
    public String toString() {
        return "Dog{ " + "name= " + getName() + ", voice= " + getVoice() + ", jump= " + jump + ", run= " + run + ", bite= " + bite + " }";
    }
}
