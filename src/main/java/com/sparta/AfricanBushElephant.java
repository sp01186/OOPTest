package com.sparta;

public class AfricanBushElephant extends Elephant{

    @Override
    public int getSpeed() {
        return (weight/4500) * 14;
    }
}
