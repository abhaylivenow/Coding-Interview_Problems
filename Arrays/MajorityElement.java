import java.util.*;
import java.lang.*;
import java.io.*;

public class MajorityElement {

    public static void main(String[] args){

        int[] arr = {1,2,3,1,1,2,3,2,2,2,2,2}; // 2
        System.out.println(getMajority(arr)); 
        
    }
    
    public static int getMajority(int[] arr){
        
        int count = 0;
        int can = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){

            if(count == 0){
                can = arr[i];
            }
            if(can == arr[i]){
                count++;
            }
            else {
                count--;
            }

        }
        return can;
    }
}
