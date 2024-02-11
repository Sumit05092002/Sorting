package Sorting;
public class Bubble {
    public static void main(String args[]){
        int arr[]={23,12,98,95,76};
        bubble(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubble(int arr[],int size){
        for(int i=0;i<size;i++){
            int swap=0;
            System.out.println("sorting in progress");
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
}
