public class ImplementStrStr{
    public static void main(String[] args){

        String s1 = "rat";
        String s2 = "ar";

        System.out.println(strstr(s1,s2));

    }
    public static int strstr(String s1, String s2){

        int n = s1.length();
        int m = s2.length();

        for(int i=0;i<=n-m;i++){

            if(s1.substring(i,i+m).equals(s2)) return i;

        }
        return -1;
    }
}