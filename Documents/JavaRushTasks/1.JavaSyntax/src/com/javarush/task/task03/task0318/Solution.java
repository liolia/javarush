package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sTime = bufferedReader.readLine(); //читаем строку с клавиатуры
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nTime = Integer.parseInt(sTime); //преобразовываем строку в число.
        System.out.println(name + " захватит мир через " + nTime + " лет. Му-ха-ха!");
    }
}
