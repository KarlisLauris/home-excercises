package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner sc = new Scanner(System.in);
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        Map<String, List<String>> map = new HashMap<>();

        for (String line : lines) {
            String[] split = line.split("->");
            String key = split[0].trim();
            String value = split[1].trim();
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                List<String> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }
        while (true) {
            System.out.println("What would you like to do:");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press #");
            String input = sc.nextLine();

            switch (input) {
                case "1" -> createConnectedRoundTrip(map);
                case "#" -> System.exit(0);
            }
        }


    }

    public static void printCities(Map<String, List<String>> map) {
        map.keySet().forEach(System.out::println);
    }

    public static void createConnectedRoundTrip(Map<String, List<String>> map) {
        printCities(map);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select a city from which you would like to start");
        String city = sc.nextLine();
        List<String> destinations = map.get(city);
        System.out.println("Please select a destination");
        destinations.forEach(System.out::println);
        String destination = sc.nextLine();

        List<String> roundTrips = new ArrayList<>();
        for (String s : map.get(destination)) {
            if (s.equals(city)) {
                roundTrips.add(destination);
                System.out.println("Round trip found: " + city + " -> " + destination + " -> " + city);
                return;
            }else if(map.get(s).contains(city)){
                roundTrips.add(destination + " -> " + s + " -> " + city);
            }
        }
        if(roundTrips.isEmpty()){
            System.out.println("No round trips found");
        }else{
            System.out.println("Round trip found:");
            roundTrips.forEach(System.out::println);
        }
    }


}
