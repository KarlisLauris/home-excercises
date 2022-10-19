package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<Integer, PhoneEntry> entries;

    public PhoneDirectory() {
        entries = new TreeMap<>();
    }

    private int find(String name) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getNumber(String name) {
        int index = find(name);
        if (index == -1) {
            return null;
        }
        return entries.get(index).number;
    }

    public void putNumber(String name, String number) {
        int index = find(name);
        if (index == -1) {
            PhoneEntry entry = new PhoneEntry();
            entry.name = name;
            entry.number = number;
            entries.put(entries.size(), entry);
        } else {
            entries.get(index).number = number;
        }
    }

}
