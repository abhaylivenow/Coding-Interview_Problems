import java.util.*;

public class DivisorGame {
    public static void main(String[] args){
        int n = 7;
        int[] cache = new int[n+1];
        Arrays.fill(cache,-1);
        System.out.println(canWin(n,cache));
    }
    public static boolean canWin(int n, int[] cache){   // 0--> true 1--> false  -1;  O(n * n/2) --> O(N2) O(N)
        if(n <= 1) return false;

        if(cache[n] != -1){
            if(cache[n] == 0) return false;
            else return false;
        }

        for(int x = 1 ; x <= n/2 ;x++){

            if(n%x == 0){
                if(!canWin(n-x,cache)){
                    cache[x] = 0;
                    return true;
                } 
            }

        }
        cache[n] = 1;
        return false;
    }
}
