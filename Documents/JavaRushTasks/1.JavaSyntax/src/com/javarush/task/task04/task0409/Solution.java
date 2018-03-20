package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        //напишите тут ваш код
        int a1 = 10 - a;
        int b1 = 10 - b;
        a1 = abs(a1);
        b1 = abs(b1);
        if (a1 < b1) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}