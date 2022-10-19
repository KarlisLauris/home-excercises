package io.codelex.enums.practice;

public enum Exercise2 {
    STONE("t","Stone breaks scissor, I won!"), PAPER("p","Paper covers stone, I won!"), SCISSORS("s","Scissor cuts paper, I won!");

    private final String value;
    private  final String message;

    Exercise2(String win, String s) {
        this.value = win;
        this.message = s;
    }



    public String getValue() {
        return value;
    }
    public String getWin() {
        return message;
    }
    public static Exercise2 fromValue(String value) {
        for (Exercise2 exercise2 : Exercise2.values()) {
            if (exercise2.getValue().equals(value)) {
                return exercise2;
            }
        }
        throw new IllegalArgumentException("No enum constant " + Exercise2.class.getCanonicalName() + " with value " + value);
    }




}
