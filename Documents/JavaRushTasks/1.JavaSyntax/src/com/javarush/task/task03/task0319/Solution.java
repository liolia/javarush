package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //InputStream inputStream = System.in;
        //Reader inputStreamReader = new InputStreamReader(inputStream);
        //BufferedReader reader = new BufferedReader(inputStreamReader);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine(); //читаем строку с клавиатуры
        String sSalary = reader.readLine(); //читаем строку с клавиатуры
        String sTime = reader.readLine(); //читаем строку с клавиатуры
        int nSalary = Integer.parseInt(sSalary); //преобразовываем строку в число.
        int nTime = Integer.parseInt(sTime); //преобразовываем строку в число.
        System.out.println(name + " получает " + nSalary + " через " + nTime + " лет.");
    }
}
