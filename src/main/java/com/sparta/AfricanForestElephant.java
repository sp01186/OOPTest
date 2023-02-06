package com.sparta;

public class AfricanForestElephant extends  Elephant {

    @Override
    public int getSpeed() {
        return (weight/4000) * 15;
    }
}
