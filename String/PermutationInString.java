public class PermutationInString{
    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "dbabaaaacd";

        System.out.println(isPermutation(s1,s2));
    }
    public static boolean isPermutation(String s1, String s2){

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        int l1 = ch1.length;
        int l2 = ch2.length;

        if(l2 < l1) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i=0;i<l1;i++){
            s1Count[ch1[i] - 'a']++;  
            s2Count[ch2[i] - 'a']++;
        }

        if(isSame(s1Count,s2Count)) return true;

        for(int i=1;i<=l2-l1;i++){

            s2Count[ch2[i-1] - 'a']--;
            s2Count[ch2[i+l1-1] - 'a']++;
            
            if(isSame(s1Count,s2Count)) return true;

        }
        return false;

    }

    public static boolean isSame(int[] arr1, int[] arr2){

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}