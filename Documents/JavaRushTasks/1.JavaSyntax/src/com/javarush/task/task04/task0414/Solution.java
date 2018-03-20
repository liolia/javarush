package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int year = Integer.parseInt(reader.readLine());
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            x = 365;
        } else {
            x = 366;
        }
        System.out.println("количество дней в году: " + x);
    }
}