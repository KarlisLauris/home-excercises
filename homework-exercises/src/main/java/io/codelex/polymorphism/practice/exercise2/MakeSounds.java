package io.codelex.polymorphism.practice.exercise2;

import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Radio radio = new Radio();
        Parrot parrot = new Parrot();
        Firework firework = new Firework();
        List<Sound> sounds = List.of(radio, parrot, firework);
        for (Sound sound : sounds) {
            sound.playSound();
        }
    }
}
