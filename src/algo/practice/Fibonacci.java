package algo.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    static List<Integer> listofFib = new ArrayList<>();
    static int[] arr =new int[10];
    public static List<Integer> finonacciSequence(int noOfSeequence){
        for(int i =0; i<=noOfSeequence;i++){
            if(i == 0 || i == 1){
                listofFib.add(i);
            }
            else {
                int newSeq = listofFib.get(i-1)+ listofFib.get(i-2);
                listofFib.add(newSeq);
            }
        }
        return listofFib;
    }

    public static int[] finonacciSequence1(int noOfSeequence){
        for(int i =0; i<noOfSeequence;i++){
            if(i == 0 || i == 1){
                arr[i] = i;
            }
            else {
                int newSeq = arr[i-1]+ arr[i-2];
                arr[i] = newSeq;
            }
        }
        return arr;
    }

    public static int fibonacciRecursionNthItem(int n){

        if(n == 0){
            return 0;
        }
        else if( n ==1){
            return 1;
        }
        else {
            return fibonacciRecursionNthItem(n-1) + fibonacciRecursionNthItem(n-2);
        }

    }




    public static void main(String[] args) {
        System.out.println(finonacciSequence(10));
        System.out.println("Fib number at sequence---> "+ fibonacciRecursionNthItem(10));
        System.out.println(Arrays.toString(finonacciSequence1(10)));

    }
}