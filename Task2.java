package com.company;

public class Task2 {
    static void quicksort(int[] arr, int low, int high){  // метод быстрой сортировки
        if(low < high){
            int p = partition(arr, low, high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);
        }
    }