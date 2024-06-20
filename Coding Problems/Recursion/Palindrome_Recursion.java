package JovacCP;

public class Palindrome_Recursion {
    public static void main(String[] args) {
        String s="abdca";
        System.out.println(Palindrome(s,0,s.length()-1));
    }
    public static boolean Palindrome(String s,int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)==s.charAt(j)){
            return true && Palindrome(s,i+1,j-1);
        }
        else {
            return false;
        }
    }
}
