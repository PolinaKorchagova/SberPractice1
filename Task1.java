package com.company;

public class Task1 {

    class ArrayBubble {

        public void bubbleSorter() {                      //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
            for (int out = elems - 1; out >= 1; out--) {  //Внешний цикл
                for (int in = 0; in < out; in++) {        //Внутренний цикл
                    if (a[in] > a[in + 1])                //Если порядок элементов нарушен
                        toSwap(in, in + 1);               //вызвать метод, меняющий местами

                }
            }
        }
    }

