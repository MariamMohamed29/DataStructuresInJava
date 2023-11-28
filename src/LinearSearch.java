public class LinearSearch {
    static String findIndex(int [] arr,int key){
        for(int element : arr){
            if(element==key)
                return "found";
        }
        return "not found";
    }
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        int key=3;
       System.out.println(findIndex(arr,key));
    }
}
