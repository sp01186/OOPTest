package com.sparta;

public class Lion extends Animal implements IsCat {
    private int weight = 300;
    private String colour = "yellow";
    private boolean hunts = true;
    private String sound = "Raawr";


    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getSpeed() {
        return weight/200 * 35;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean hunts() {
        return hunts;
    }

    @Override
    public String makesSound() {
        return sound;
    }


}
