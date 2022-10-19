package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        final List<String> lines = Files.readAllLines(path, charset);
        System.out.println("Lines = " + lines.size());
        System.out.println("Words = " + words(lines));
        System.out.println("Chars = " + chars(lines));
    }

    private static String words(List<String> lines) {
        return lines.stream()
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(word -> !word.isEmpty())
                .count() + "";
    }
    private static String chars(List<String> lines) {
        return lines.stream().mapToInt(String::length).sum() + "";
    }

}
