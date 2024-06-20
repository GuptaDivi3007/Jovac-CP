package recursion;

public class Subsequence_abc {
    public static void main(String[] args) {
        String s="abc";
        String ans="";
        subsequence(s,ans);
    }
    public static void subsequence(String s,String ans){
//        base case
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
//        recursive call + small calculation
        subsequence(s.substring(1),ans+ch);
        subsequence(s.substring(1),ans);
    }
}
