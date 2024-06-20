package JovacCP;

public class Sliding_Window {
    public static void main(String[] args) {

        // brute force approach O(N^2)

        int []arr={1,8,30,-5,20,7};
        int k=3;
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int curr_sum=0;
            for(int j=i;j<i+k;j++){
                curr_sum+=arr[j];
            }
            maxSum=Math.max(maxSum,curr_sum);
        }
        System.out.println(maxSum);


        // efficient approach O(N)

        int []arr={1,8,30,-5,20,7};
        int k=3;
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<k;i++){
            curr_sum = curr_sum + arr[i];
        }
        for(int j=k;j<n;j++){
            curr_sum = curr_sum + arr[j] - arr[j-k];
            maxSum=Math.max(maxSum,curr_sum);
        }
        System.out.println(maxSum);
    }
}
