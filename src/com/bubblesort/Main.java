package com.bubblesort;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int [10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < array.length; i++){
            System.out.println("Введите число от 1 до 10");
            array [i] = scanner.nextInt();
        }

        System.out.println("Ваш Массив");

        for (int i = 1; i<array.length; i++) {
        System.out.println(array[i]);
    }

        boolean isRunning = true;
        Scanner scan = new Scanner (System.in);
        while (isRunning) {
            System.out.println("Нажмите 1,если желаете  - Произвести сортировку пузырьком");
            System.out.println("Нажмите 2,если желаете  - Выйти");
            String choice = scan.nextLine();

            if(choice.equals("1")){
                System.out.println("Сортировка");
                isRunning = false;
            }

            if(choice.equals("2")) {
                isRunning = false;
            }



        }


    }
}
