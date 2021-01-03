package org.itstep.Animal;

public abstract class Animal {
    private final String type;
    private String name;
    private int age;
    private int weight;
    private int aviaryNumber;
    private int timeSpentInTheZoo;
    private int foodExpensesForTheCurrentDay;
    private int foodExpensesForAllTime = 0;

    protected Animal(String type, String name, int age, int weight, int aviaryNumber, int timeSpentInTheZoo) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.aviaryNumber = aviaryNumber;
        this.timeSpentInTheZoo = timeSpentInTheZoo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAviaryNumber() {
        return aviaryNumber;
    }

    public void setAviaryNumber(int aviaryNumber) {
        this.aviaryNumber = aviaryNumber;
    }

    public int getTimeSpentInTheZoo() {
        return timeSpentInTheZoo;
    }

    public void setTimeSpentInTheZoo(int timeSpentInTheZoo) {
        this.timeSpentInTheZoo = timeSpentInTheZoo;
    }

    public int getFoodExpensesForTheCurrentDay() {
        return foodExpensesForTheCurrentDay;
    }

    public void setFoodExpensesForTheCurrentDay(int foodExpensesForTheCurrentDay) {
        this.foodExpensesForTheCurrentDay = foodExpensesForTheCurrentDay;
    }

    public int getFoodExpensesForAllTime() {
        return foodExpensesForAllTime;
    }

    public void setFoodExpensesForAllTime(int foodExpensesForAllTime) {
        this.foodExpensesForAllTime = foodExpensesForAllTime;
    }

    public String getType() {
        return type;
    }
}
