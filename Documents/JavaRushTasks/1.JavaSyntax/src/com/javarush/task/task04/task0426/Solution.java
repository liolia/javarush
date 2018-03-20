package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String sign;
        String odd = "";
        if (number > 0) {
            sign = "положительное ";
        } else {
            sign = "отрицательное ";
        }
        if (number == 0) {
            System.out.println("ноль");
        } else {
            if (number % 2 == 0) {
                odd = "четное ";
            } else {
                odd = "нечетное ";
            }
            System.out.println(sign + odd + "число");
        }
    }
}
