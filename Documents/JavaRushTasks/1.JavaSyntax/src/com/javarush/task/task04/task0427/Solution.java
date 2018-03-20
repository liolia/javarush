package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String digits;
        String odd;
        if (number > 0 && number < 1000) {
            if (number % 2 == 0) {
                odd = "четное";
            } else {
                odd = "нечетное";
            }
            if (number < 10) {
                digits = "одно";
            } else if (number < 100) {
                digits = "дву";
            } else {
                digits = "трех";
            }
            System.out.println(odd + " " + digits + "значное число");
        }
    }
}
