package algo.practice;


// Write a function that takes in a non-empty array of distinct integers and an integer

// representing a target sum. If any two numbers in the input array sum up to the target sum,

// the function should return them in an array. If no two numbers sum up to the target sum,

// the function should return an empty array.

// Assume that there will be at most one pair of numbers summing up to the target sum.

// Sample input: [3, 5, -4, 8, 11, 1, -1, 6], 10

import java.util.Arrays;

// Sample output: [-1, 11]
public class TwoNumberSum {

    public static int [] twoNumberSum(int[] arrayOfInteger, int targetSum){
        for(int i = 0; i< arrayOfInteger.length-1; i++){
            for(int j= i+1; j<arrayOfInteger.length-1; j++){
                if( (arrayOfInteger[i] + arrayOfInteger[j]) == targetSum ){
                    return new int[] {arrayOfInteger[i], arrayOfInteger[j]};
                }
            }
        }
        return new int[]{};
    }

    public static int [] twoNumberSum1(int[] arrayOfInteger, int targetSum){
        int left =0;
        int right = arrayOfInteger.length-1;

        Arrays.sort(arrayOfInteger);

        //sorted:  [-4,-1,1,3,5,6,8,11]
        while(left<right){
            int currentSum = arrayOfInteger[left] + arrayOfInteger[right];
            if (currentSum == targetSum) {
                return new int[]{arrayOfInteger[left], arrayOfInteger[right]};
            } else if( currentSum < targetSum){
                left++;
            }
            else {
                right--;
            }
        }
    return new int[]{};
    }

    public static int [] twoNumberSum2(int[] arrayOfInteger, int targetSum){
        int left =0;
        int right = arrayOfInteger.length-1;

        Arrays.sort(arrayOfInteger);

        //sorted:  [-4,-1,1,3,5,6,8,11]
        while(left<right){
            int currentSum = arrayOfInteger[left] + arrayOfInteger[right];
            if (currentSum == targetSum) {
                return new int[]{arrayOfInteger[left], arrayOfInteger[right]};
            } else if( currentSum < targetSum){
                left++;            }
            else {
                right--;            }        }
        return new int[]{};
    }



    public static void main(String[] args) {
        int[] testData = new int[] {3, 5, -4, 8, 11, 1, -1, 6} ;
        System.out.println(Arrays.toString(twoNumberSum(testData, 10)));
        System.out.println(Arrays.toString(twoNumberSum1(testData,10)));
    }

}
