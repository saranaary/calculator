package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите выражение");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replaceAll("\\s","");
        String[] arr = str.split("[+\\-*/]");
        if (arr.length!=2){
            throw new RuntimeException("Выражение должно содержать два целых числа и одну операцию");}
        String arr1 = arr[0];
        String arr2 = arr[1];
        int n1 = Integer.parseInt(arr1);
        int n2 = Integer.parseInt(arr2);
        if ((n1 > 10 || n1 < 0 )||(n2 > 10 || n2 < 0)){
            throw new RuntimeException("Введите числа от 0 до 10");
        }
            if (str.contains("+")) {
                System.out.println(n1 + n2);
            } else if (str.contains("-")) {
                System.out.println(n1 - n2);
            } else if (str.contains("*")) {
                System.out.println(n1 * n2);
            } else if (str.contains("/")) {
                System.out.println(n1 / n2);
            }else {
                System.out.println("Неверная математическая операция");
            }
    }
}










