package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int sum = a;
        while (a != -1) {
            a = Integer.parseInt(reader.readLine());
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
