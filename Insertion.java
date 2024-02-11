package Sorting;
public class Insertion {
    public static void main(String args[]){
        int arr[]={1,10,7,4,8,2,11};
        insertion(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void insertion(int arr[],int size){
        for(int i=1;i<size;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
    }
}
