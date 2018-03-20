package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m1 = Integer.parseInt(reader.readLine());
        int m2 = Integer.parseInt(reader.readLine());
        int m3 = Integer.parseInt(reader.readLine());
        int i = 0;
        if (m1 > 0) {
            i++;
        }
        if (m2 > 0) {
            i++;
        }
        if (m3 > 0) {
            i++;
        }
        System.out.println(i);
    }
}
