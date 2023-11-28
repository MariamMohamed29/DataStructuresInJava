import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int [] arr={10,9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
    }
    static void selectionSort(int [] arr){
        int min;
        for(int i=0;i<arr.length-1;i++){
             min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            swap(arr,min,i);
        }
    }
    static void swap(int[] arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
}
