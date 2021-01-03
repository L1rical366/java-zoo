package org.itstep.Animal;

public class Tiger extends Animal{
    private String color;

    public Tiger(String type, String name, int age, int weight, int aviaryNumber, int timeSpentInTheZoo, String color) {
        super(type, name, age, weight, aviaryNumber, timeSpentInTheZoo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
