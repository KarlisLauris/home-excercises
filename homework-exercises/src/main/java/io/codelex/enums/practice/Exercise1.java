package io.codelex.enums.practice;

public enum Exercise1 {
    //Create an enum representing cardinal points - North, South, East and West

    North("Up"),
    South("Down"),
    East("Left"),
    West("Right");

    private final String direction;

    Exercise1(String direction) {
        this.direction = direction;
    }

    public Object getDirection() {
        return direction;
    }
}
