package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int negative = 0;
        int positive = 0;
        if (a > 0) {
            positive++;
        } else if (a < 0) {
            negative++;
        }
        if (b > 0) {
            positive++;
        } else if (b < 0) {
            negative++;
        }
        if (c > 0) {
            positive++;
        } else if (c < 0) {
            negative++;
        }
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}
