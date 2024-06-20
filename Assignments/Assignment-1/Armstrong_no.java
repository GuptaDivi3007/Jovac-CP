class Solution {
    static String armstrongNumber(int n) {
        String ans="false";
        double x=0;
        int num=n;
        while(num>0){
            int temp=num%10;
            x=x+Math.pow(temp,3);
            num=num/10;
        }
        if((int)x==n){
            ans="true";
        }
        return ans;
    }
}
