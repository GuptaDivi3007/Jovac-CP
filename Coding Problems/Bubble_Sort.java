package JovacCP;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        boolean flag;
        for(int i=0;i<arr.length-1;i++){
            flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
