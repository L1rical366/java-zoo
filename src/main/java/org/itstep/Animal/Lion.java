package org.itstep.Animal;

public class Lion extends Animal{
    private boolean mane;

    public Lion(String type, String name, int age, int weight, int aviaryNumber, int timeSpentInTheZoo, boolean mane) {
        super(type, name, age, weight, aviaryNumber, timeSpentInTheZoo);
        this.mane = mane;
    }

    public boolean isMane() {
        return mane;
    }

    public void setMane(boolean mane) {
        this.mane = mane;
    }
}
