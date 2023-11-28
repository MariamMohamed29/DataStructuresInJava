import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int [] arr={7,6,5,4,3,2,1};
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));

    }
    static void swap(int[] arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
}
