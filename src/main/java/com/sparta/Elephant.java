package com.sparta;

public class Elephant extends Animal {
    protected int weight = 5000;
    protected String colour = "grey";


    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getSpeed() {
        return (weight/4500) * 15;
    }

    @Override
    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
