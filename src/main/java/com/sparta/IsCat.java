package com.sparta;

public interface IsCat {
    boolean hunts();

    default String makesSound() {
        return "meow";
    }
}
