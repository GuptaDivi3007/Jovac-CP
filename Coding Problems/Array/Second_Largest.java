class Solution {
    int print2largest(int arr[], int n) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        if(secondLargest <0){
            return -1;
        }
        return secondLargest;
    }
}
