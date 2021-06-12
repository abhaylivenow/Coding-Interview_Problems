public class RainWaterTrapping{
    public static void main(String[] args){

        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getWater(arr));

    }
    public static int getWater(int[] arr){
        
        int n = arr.length;
        int result = 0;    // result = leftMax/rightMax - arr[i];
        int lo = 0;
        int hi = n-1;

        int leftMax = 0;
        int rightMax = 0;

        while(lo <= hi){

            if(arr[lo] < arr[hi]){

                if(arr[lo] > leftMax){
                    leftMax = arr[lo];
                }

                result += leftMax - arr[lo];

                lo++;

            }else {     // arr[hi] <= arr[lo]

                if(arr[hi] > rightMax){
                    rightMax = arr[hi];
                }

                result += rightMax - arr[hi];

                hi--;
            }

        }
        return result;
    }
}