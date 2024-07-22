package com.perso;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String input = "nwcn";
        Set<Integer> seen = new HashSet<>();
        OptionalInt first = input.chars()
                .filter(i -> !seen.add(i))
                .findFirst();
        if (first.isPresent()) {
            System.out.println((char) first.getAsInt());
        }

    }
}