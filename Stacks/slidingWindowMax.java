import java.util.*;

public class slidingWindowMax {
    public static void main(String[] args){

        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = getSlidingWindowMax(arr,k);

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + ", ");
        }

    }
    public static int[] getSlidingWindowMax(int[] arr, int k){

        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] greater = new int[n];

        // fill this array with n
        Arrays.fill(greater,n);

        for(int i = 0 ; i < n ;i++){

            // pop until x > stack.peek().... when index is --> n 
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int temp = stack.pop();
                greater[temp] = i;
            }
            stack.push(i);

        }

        int[] ans = new int[n-k+1];   // [1,3,-1,-3,5,3,6,7]
        int pos = 0;

        for(int i = 0 ; i < n-k+1 ;i ++){

            int j = i;
            // check until next greater is inside the window;
            while(greater[j] < i + k){
                j = greater[j];
            }
            // here the next greater is outside the window
            ans[pos++] = arr[j];

        }
        return ans;
    }
}
