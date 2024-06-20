package JovacCP;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int []arr={64, 25, 12, 22, 11};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            swap(arr,min_idx,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public  static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
