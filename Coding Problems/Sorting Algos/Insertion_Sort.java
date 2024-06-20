package JovacCP;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int []arr={25,4,10,8,6};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
