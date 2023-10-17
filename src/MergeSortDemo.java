public class MergeSortDemo {

    // Merges two subArrays of arr[].
    // First subArray is arr[l..m]
    // Second subArray is arr[m+1..r]
   static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subArrays to be merged
        int size1 = m - l + 1;
        int size2 = r - m;

        // Create temp arrays
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        // Copy data to temp arrays
        for (int i = 0; i <size1; ++i)
            arr1[i] = arr[l + i];
        for (int j = 0; j < size2; ++j)
            arr2[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < size1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < size2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args){
       int []arr={1,2,3,5,6,7,9};
        System.out.println("Given array is");
        printArray(arr);
        sort(arr,0,arr.length-1);
        System.out.println("Sorted array is");
        printArray(arr);
    }
}
