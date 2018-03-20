package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        double t1 = t % 5;
        if (t1 >= 0 && t1 < 3) {
            System.out.println("зеленый");
        } else if (t1 >= 3 && t1 < 4) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }
    }
}