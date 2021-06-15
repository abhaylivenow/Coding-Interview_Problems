public class ValidAnagram{
    public static void main(String[] args){
        String s1 = "car";
        String s2 = "rat";

        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1 , String s2){

        if(s1.length() != s2.length()) return false;

        int[] alphabets = new int[26];

        for(char c : s1.toCharArray()){
            alphabets[c-'a']++;
        }

        for(char c : s2.toCharArray()){
            alphabets[c-'a']--;
        }

        for(int n : alphabets){
            if(n!=0) return false;
        }
        return true;
    }
}