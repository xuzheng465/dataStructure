package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            var aArray = line.split("\\|");

            var x1 = aArray[0].split(" ");
            var x2 = aArray[1].strip().split(" ");
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < x1.length; i++) {
                if (!x1[i].equals("") && !x2[i].equals(""))
                    result.add(Integer.parseInt(x1[i]) * Integer.parseInt(x2[i]));
            }

            System.out.println(result);

        }
    }

}
