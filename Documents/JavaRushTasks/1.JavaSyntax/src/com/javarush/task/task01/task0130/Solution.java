package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код

        double fahrenheit;
        fahrenheit = (celsium * 9.0 / 5) + 32;
        return fahrenheit;
    }
}