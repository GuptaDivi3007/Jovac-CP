package recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fibbo(n));
    }
    public static int fibbo(int idx){
        if(idx==0){
            return 0;
        }
        if(idx==1){
            return 1;
        }
        int x=fibbo(idx-1);
        int y=fibbo(idx-2);
        return x+y;
    }
}
