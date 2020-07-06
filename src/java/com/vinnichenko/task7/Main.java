package com.vinnichenko.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("1.-english\n2.-russian\n3.-exit");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input = "";
            String country = "";
            String language = "";
            try {
                input = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int item = Integer.parseInt(input);
            switch (item) {
                case 1:
                    language = "en";
                    country = "UK";
                    break;
                case 2:
                    language = "ru";
                    country = "BY";
                    break;
                case 3:
                    flag = false;
                    break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle resourceBundle = ResourceBundle.getBundle("message", current);
            String str1 = resourceBundle.getString("str1");
            String str2 = resourceBundle.getString("str2");
            System.out.println(str1);
            System.out.println(str2);

        }
    }
}
