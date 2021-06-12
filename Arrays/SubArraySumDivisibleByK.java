import java.util.*;
import java.lang.*;
import java.io.*;

public class SubArraySumDivisibleByK {
    public static void main(String[] args){
        
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;

        System.out.println(subArrayDivByK(arr,k));

    }

    public static int subArrayDivByK(int[] arr , int k){

        int rem = 0;
        int count = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int n = arr.length;

        for(int i=0;i<n;i++){

            sum += arr[i];

            rem = sum % k;

            if(rem < 0) rem += k;

            if(map.containsKey(rem)){
                count += map.get(rem);
                map.put(rem,map.get(rem) + 1);
            }else {
                map.put(rem,1);
            }

        }
        return count;

    }
}