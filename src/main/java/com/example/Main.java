package com.example;

public class Main {
    public static void main(String[] args) {
        ThreadRandom[] arrayThread = new ThreadRandom[10];
        int[] arr = new int[10];
        for(int i=0; i<arr.length;i++){
            arrayThread[i] = new ThreadRandom(arr, i);
        }
        for(int i=0; i<arr.length;i++){
            arrayThread[i].start();
        }
        for(int i=0; i<arr.length;i++){
            try {
                arrayThread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}