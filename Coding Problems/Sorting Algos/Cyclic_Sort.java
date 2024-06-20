package JovacCP;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[]arr={6,1,5,4,2,3};
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i+1){
                int index=arr[i]-1;
                swap(arr,i,index);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
