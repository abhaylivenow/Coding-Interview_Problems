public class CanJump {
    public static void main(String[] args){
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] arr){

        int lastValidIndex = arr.length-1;

        for(int i = arr.length-1 ; i>=0 ; i-- ){

            if(arr[i] + i >= lastValidIndex){
                lastValidIndex = i;
            }

        }
        if(lastValidIndex == 0) return true;
        else return false;
    }
}
