package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1;
        while (i < 11) {
            int j = 1;
            while (j < 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println(i * j);
            i ++;
        }
    }
}
