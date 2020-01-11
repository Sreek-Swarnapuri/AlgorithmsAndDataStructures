package SolvingCodingProblems;

import java.util.HashSet;

public class HasPairs {

    /*

    Check if a pair of numbers from a given array sums up to the given value:
    -------------------------------------------------------------------------
    - Array can or cannot be sorted.
    - If a pair is found return true.
      - else return false.
    - It would be an integer array with an integer sum value.
    - Arrays can have negative or positive numbers as well.

    Main Goal - Time complexity

     */

    //Naive or Brute force
    //Time Complexity - O(n^2)
    //Space Complexity - O(1)
    public static boolean hasPair(int[] arr, int val){

        for(int i =0; i<arr.length; i++)
        {
            for(int j = i+1;j<arr.length;j++){

                if(arr[i]+arr[j] == val)
                    return true;
            }

        }

        return false;
    }

    //Improve solution
    //Time Complexity - O(n)
    //Space Complexity - O(n)
    public static boolean hasPairImp(int[] arr, int val){

        HashSet<Integer> hashSetArr = new HashSet<Integer>();
        hashSetArr.add(val-arr[0]);

        for(int i=1; i <arr.length;i++){
            if(hashSetArr.contains(arr[i]))
                return true;
            else
                hashSetArr.add(val-arr[i]);
        }

        return false;
    }



    public static void main(String[] args){

        System.out.println(hasPair(new int[]{1,2,4,5,5},10));
        System.out.println(hasPairImp(new int[]{1,2,4,5,5},10));

    }

}
