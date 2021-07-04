import java.util.*;

public class firstNonRepeatingChar {
    public static void main(String[] args){
        String s = "aaabb";
        System.out.println(getFirstChar(s));
    }

    public static int getFirstChar(String s){
        
        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = s.toCharArray();

        for(int i = 0 ; i < ch.length ; i ++){

            if(map.containsKey(ch[i])){

                map.put(ch[i] , map.get(ch[i]) + 1);

            }else map.put(ch[i] , 1);

        }

        for(int i = 0 ; i < ch.length; i++){

            char c = ch[i];

            if(map.get(c) == 1) return i;

        }
        return -1;
    }
}
