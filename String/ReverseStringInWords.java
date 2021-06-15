public class ReverseStringInWords{
    public static void main(String[] args){
        String s = "     We are a      team     ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){

        StringBuilder sb = new StringBuilder();

        int i = s.length()-1;

        while(i>=0){

            while(i>=0 && s.charAt(i) == ' ') i--;

            int j = i;

            if(i<0) break;

            while(i>=0 && s.charAt(i) != ' ') i--;

            if(sb.toString().length() == 0){
                String subString = s.substring(i+1,j+1);
                sb.append(subString);
            }
            else {
                String subString = s.substring(i+1,j+1);
                sb.append(" " + subString);
            }
            

        }
        return sb.toString();
    }
}