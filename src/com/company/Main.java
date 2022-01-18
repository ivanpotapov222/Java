package com.company;

public class Main {

    public static void main(String[] args) {

    //Объявление массива
        int [] arr = new int[4]; //Или int [] arr = new int [] {2, 4, 6, 8};
    //Присвоение значений элементам массива
        arr[0] = 2;

        arr[1] = 4;

        arr[2] = 6;

        arr[3] = 8;

        //Вывод элементов массива
        System.out.println("Вывод элементов массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
