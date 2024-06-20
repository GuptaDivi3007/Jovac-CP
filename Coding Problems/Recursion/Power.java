package recursion;

public class Power {
    public static void main(String[] args) {
        int a=3,b=4;
        System.out.println(pow(a,b));
    }
    public static int pow(int x,int y){
        if(y==0){
            return 1;
        }
        int p=pow(x,y-1);
        return x*p;
    }
}
