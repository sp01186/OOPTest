package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    @DisplayName("Testing Elephant base")
    public void testingElephantObject() {
        Animal elephant = new Elephant();
        Assertions.assertEquals(5000, elephant.getWeight());
        Assertions.assertEquals("grey", elephant.getColour());
    }

    @Test
    @DisplayName("Testing subclass of Elephants")
    public void checkingSpeedsAreDifferent() {
        Animal elephant = new Elephant();
        Animal bushElephant = new AfricanBushElephant();
        Animal forestElephant = new AfricanForestElephant();
        Assertions.assertNotEquals(elephant.getSpeed(), bushElephant.getSpeed());
        Assertions.assertNotEquals(elephant.getSpeed(), forestElephant.getSpeed());
    }

    @Test
    @DisplayName("Checking elephant setters")
    public void checkingElephantSetters() {
        Animal elephant = new Elephant();
        elephant.setColour("red");
        elephant.setWeight(5500);
        Assertions.assertEquals(5500, elephant.getWeight());
        Assertions.assertEquals("red", elephant.getColour());
    }

    @Test
    @DisplayName("Testing lion interface")
    public void checkingLionInterface() {
        Lion lion = new Lion();
        Assertions.assertEquals("Raawr", lion.makesSound());
        Assertions.assertTrue(lion.hunts());
    }
}