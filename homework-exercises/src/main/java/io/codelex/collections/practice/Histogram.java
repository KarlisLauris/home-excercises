package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Write a console program named Histogram that reads a list of exam scores from an input file that contains one score per line and then displays a histogram of those numbers, divided into the ranges 0-9, 10-19, 20-29, and so forth, up to the range containing only the value 100.
//
//00-09:
//10-19: *
//20-29: *
//30-39: **
//40-49: *
//50-59: *****
//60-69: *******
//70-79: *****************
//80-89: ******
//90-99: **********
//  100: *
public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        final List<Integer> scoresInt = new ArrayList<>(Arrays.stream(scores.split(" ")).mapToInt(Integer::parseInt).boxed().toList());
        final int[] histogram = new int[11];
        for (Integer score : scoresInt) {
            histogram[score / 10]++;
        }
        for (int i = 0; i < histogram.length; i++) {
            if(i == 10){
                System.out.print("  100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            System.out.println("*".repeat(histogram[i]));
        }

    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
