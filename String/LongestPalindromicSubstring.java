public class LongestPalindromicSubstring{

    public static void main(String[] args){

        String s = "cababadc";
        System.out.println(getPalindrome(s));

    }

    public static String getPalindrome(String s){

        int start = s.length()-1;
        int end = s.length() - 1;
        int len = s.length();

        int[][] dp = new int[len][len];

        for(int i=0;i<len;i++){
            dp[i][i] = 1;
        }

        for(int i=0;i<len-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = 1;
                start = i;
                end = i+1;
            }
        }

        for(int i=2;i<len;i++){
            for(int j=0;j<=len-i-1;j++){

                if(s.charAt(j) == s.charAt(i+j) && dp[j+1][i-1+j] == 1){
                    dp[j][j+i] = 1;
                    start = j;
                    end = i+j;
                }else {
                    dp[j][j+i] = 0;
                }

            }
        }

        return s.substring(start,end+1);

    }
}