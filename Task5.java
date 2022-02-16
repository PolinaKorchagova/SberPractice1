package com.company;

public class Task5 {
    public static void main(String[]args) {
        int a = 2, b = 100;
        for(int i = a; i <= b; i++){
            if(k(i)){
                  System.out.print(i + " ");
            }
        }
    }
    public static boolean k(int x) {
        if (x < 2) return false;
        int y;
        for (int i = 2; i <= x / 2; i++) {
            y = x % i;
            if (y == 0) {
                return false;
            }
        }
        return true;
    }
}

