import java.util.*;

public class unCommonWord {
    public static void main(String[] args){
        String s1 = "apple apple";
        String s2 = "banana";

        String[] ans = getWords(s1,s2);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static String[] getWords(String s1, String s2){

        String combined = s1 + " " + s2;

        List<String> ans = new ArrayList<>();

        String[] arr = combined.split(" ");
        int n = arr.length;

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i ++){

            if(map.containsKey(arr[i])){

                map.put(arr[i] , map.get(arr[i]) + 1);

            }else {
                map.put(arr[i] , 1);
            }

        }

        for( String s : map.keySet()){

            if(map.get(s) == 1) ans.add(s);

        }

        return ans.toArray(new String[0]);

    }
}
