package com.company;
public class Task8 {


    public static void main(String[] args) {
        boolean exit;
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String answer;
        Scanner read = new
                Scanner(System.in);
        exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit) {
                break;
            }
            answer = read.nextLine();
            if (answer.equals("Троллейбус")) {
                System.out.println("Правильно!");
                exit = true;

            } else if (answer.equals("Сдаюсь")) {
                System.out.println("Правильный ответ: троллейбус.");
                exit = true;
            } else {
                System.out.println("Подумай еще.");
            }
        }
    }
}