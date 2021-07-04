public class sortArrayByParity {
    public static void main(String[] args){

        int[] arr = {3,2,9,1,4,7}; 
        
        int[] ans = getArray(arr);
        
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ,");
        }
    }

    public static int[] getArray(int[] arr){
        
        int n = arr.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n-1;

        for(int i = 0 ; i < n ; i++){

            if(arr[i] % 2 == 0){
                ans[left] = arr[i];
                left++;
            }else {
                ans[right] = arr[i];
                right--;
            }

        }
        return ans;
    }
}
