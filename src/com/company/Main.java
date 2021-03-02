package com.company;

import java.util.Random;
import java.util.Scanner;
public class Main {
            public static void main(String[] args) {//функция
//                //в цикле прокрутить все
//                Random r = new Random();
//                int[] numbers = new int[100];
//                for(int i = 0; i<numbers.length; i++){
//                    numbers[i] = r.nextInt(101);
//                }
//                //создать переменные для sum -- отдельно для >=50
//                int sum = 0;
                //отдельно для меньше
                //счетчик для тех кто больше чем 50
                //счетчик остальных, а можно посчитать отняв от общего кол ва
                //посчитать с помощью цикла
                //если больше то в один sum
                //если меньше то в другой(else)
                //sum/кол во
                //sum1/counter
                //sum2/(numbers.length - counter)
//                Random rand = new Random();
//                int []numbers = new int [10];
//                for (int i = 0; i<10; i ++){
//                    numbers [i] = rand.nextInt(101);
//                }
//                float sum = 0f;
//                float sum2 = 0f;
//                int counter = 0;
//                int counter2 =0;
//                for (int i= 0; i<10; i++){
//                    System.out.print(numbers[i] + " ");
//                    if (numbers[i]<50){
//                        sum = sum + numbers[i];
//                        counter++;
//                    }else{
//                        sum2 = sum2 + numbers[i];
//                        counter2++;
//                    }
//                }
//                System.out.println("average (n<50):" + sum/counter);
//                System.out.println("average (n>=50):" + sum2/counter2);
//                int[] array = {4, 5, 7, 8, 3, 2, 1}; // = new int[7]
//
//                Scanner sc = new Scanner(System.in);
//                int number = sc.nextInt();
//                int i = 0;
//                int N = array.length;
//                while(i < N && array[i] != number){
//                    i++;
//                }
//                //0 1 2 3 4 5 6 7
//                if(i < N)
//                    System.out.println(array[i] + " найдено");
//                else
//                    System.out.println("не нашли");
//                Random r = new Random();
//                int [] n = new int[5];
//                for (int i = 0; i<n.length; i++){
//                    n [i]= r.nextInt(6);
//                    System.out.print(n [i] + " ");
//                }
//                int Max = n[0], nMax=0;
//                int Min = n[0], nMin=0;
//                for (int i = 0; i<n.length; i++) {
//                 if (n[i]>Max){
//                     n[i] = Max;
//                     nMax = i;
//                        System.out.println("Максимальный элемент А[" + nMax + "] =" + Max);
//                    } if (n[i]==Min){
//                     n[i] = Min;
//                     nMin = i;
//                        System.out.println("Минимальный элемент А [" + nMin + "] =" + Min);
//                    }
//                }
//                Random rand = new Random();
//                int[] numbers = new int[10];
//
//                for(int i = 0; i < numbers.length; i++){
//                    numbers[i] = rand.nextInt(6);//0 - 5
//                    System.out.print(numbers[i] + " ");
//                }
//                int pred = numbers[0];
//
//                boolean notfound = true;
//
//                for(int i = 1; i < numbers.length; i++){
//                    if(pred == numbers[i]){
//                        notfound = false;//потому что found
//                        System.out.println("Нашли: " + pred);
//                        break;
//                    }
//                    else{
//                        pred = numbers[i];
//                    }
//                }
//                if(notfound){
//                    System.out.println("Not found");
//                }
                Random r = new Random();
                int [] A = new int[5];
                for (int i = 0; i<A.length; i++){
                    A [i]= r.nextInt(6);
                    System.out.print(A [i] + " ");
                }
                int Max = A[0], nMax= 0;
                for (int i =1; i < A.length; i++) {

                    if (A[i] > Max){
                        Max = A[i];
                        nMax = i;
                            System.out.println("Максимальный элемент: A[" + nMax + "] = " + Max);
                    }
                    int Min = A[0], nMin =0;
                    if (A[i] < Min){
                        Min = A[i];
                        nMin =i;
                        System.out.println("Минимальный элемент: A[" + nMin + "] = " + Min);
                    }
                }

            }

}
