package recursion;

public class Coin_toss {
//    static int count=0;
//    public static void main(String[] args) {
//        int n=3;
//        String ans="";
//        coin(n,ans);
//        System.out.println(count);
//    }
//    public static void coin(int n,String ans){
////        base call
//        if(n==0){
//            count++;
//            System.out.println(ans);
//            return;
//        }
////        recursive call
//        coin(n-1,"H"+ans);
//        coin(n-1,"T"+ans);
//    }


// OR

    public static void main(String[] args) {
        int n = 3;
        String ans = "";
        System.out.println(coin(n, ans));
    }

    public static int coin(int n, String ans) {
//        base call
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }
//        recursive call
        int x=coin(n - 1, ans+"H");
        int y=coin(n - 1, ans+"T");
        return x+y;
    }
}