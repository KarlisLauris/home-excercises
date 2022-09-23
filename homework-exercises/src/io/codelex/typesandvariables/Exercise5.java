package io.codelex.typesandvariables;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("English III", "Ms. Lapan");
        map.put("Precalculus", "Mrs. Gideon");
        map.put("Music Theory", "Mr. Davis");
        map.put("Biotechnology", "Ms. Palmer");
        map.put("Principles of Technology I", "Ms. Garcia");
        map.put("Latin II", "Mrs. Barnett");
        map.put("AP US History", "Ms. Johannessen");
        map.put("Business Computer Infomation Systems", "Mr. James");

        int counter = 1;
        System.out.println("+------------------------------------------------------------+");
        for (String key : map.keySet()) {
            System.out.println("| " + counter + " | " + key + " | " + map.get(key));
            counter++;
        }
        System.out.println("+------------------------------------------------------------+");
    }
}
