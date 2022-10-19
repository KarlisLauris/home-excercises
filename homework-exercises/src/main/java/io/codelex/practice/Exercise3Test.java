package io.codelex.practice;

import java.io.File;
import java.io.IOException;

public class Exercise3Test {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/io/codelex/practice/Exercise3.java");
        Exercise3.cat(file);
    }
}
