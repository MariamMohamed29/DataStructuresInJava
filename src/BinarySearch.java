import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int [] arr, int key){
        // array must be sorted in binary search
        Arrays.stream(arr).sorted();
        int lower=0;
        int upper=arr.length-1;
        int index=0;
        while (true){
            index=(upper+lower)/2;
            if(arr[index]==key)
                return index;
            else if (arr[index]<key)
                lower=index+1;
            else if (arr[index]>key)
                upper=index-1;
            // to avoid the finite loop if the key is greater than all the largest element in the array
            if(lower>upper)
                return -1;
        }
    }
    public static void main(String[] args){
        int[] arr={2,1,3,6,5,4,8,7,10,9};
        int key=3;
        System.out.println(binarySearch(arr,key));
    }
}
