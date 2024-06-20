package recursion;

public class Unique_path {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        String ans="";
        printPath(0,0,m-1,n-1,ans);
    }
    public static void printPath(int sx,int sy,int ex,int ey,String ans){
        if(sx==ex && sy==ey){
            System.out.println(ans);
            return;
        }
        if(sx>ex || sy>ey){
            return;
        }
        printPath(sx+1,sy,ex,ey,ans+"V");
        printPath(sx,sy+1,ex,ey,ans+"H");
    }
}
