import javax.print.attribute.standard.PrinterLocation;
import java.util.Arrays;

public class BubbleSort {
    static void swap(int[] arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
    public static void main(String[] args){
        int [] arr={10,9,8,7,6,5,4,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
        Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
        //9,8,7,6,5,4,3,2,1,10
        //1,8,7,6,5,4,3,2,9,10
        //1,2,7,6,5,4,3,8,9,10
        //1,2,3,6,5,4,7,8,9,10
        //1,2,3,4,5,6,7,8,9,10
    }
}
