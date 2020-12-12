package com.company;

public class Main {

    public static void main(String[] args) {

        int[] list = { 2, 5,8,25,17,52,11,78,32,47};

        int min = list[0];
        int max = list[0];

        for (int i = 0; i < list.length ; i++) {
            if (list[i] < min)
                min = list[i];
        }

        for (int i = 0; i < list.length ; i++) {
            if(list[i] > max)
                max = list[i];

        }
        System.out.println("Мінімальне число масиву: " + min);
        System.out.println("Максимальне числа масиву: " + max);
    }
}
