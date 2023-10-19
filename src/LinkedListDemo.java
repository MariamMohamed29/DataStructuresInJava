import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> linkedList=new LinkedList<>();
        //adding elements
        linkedList.add("mariam");
        //adding element at specific index
        linkedList.add(1,"Ali");
        linkedList.add("Doaa");
        linkedList.addFirst("Mahmoud");
        linkedList.addLast("Manar");
        //updating elements in linkedList
        linkedList.set(1,"Mohamed");
        //removing elements from linkedList
        linkedList.remove("mariam");
        System.out.println("after removing object"+linkedList);
        linkedList.remove(1);
        System.out.println("after removing index"+linkedList);
//        //Iterating the linkedList using get() method
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
//        //Iterating the linkedList using for each loop
        for(String str:linkedList){
            System.out.println(str);
        }

        Object[] arr=linkedList.toArray();
        for (Object obj:arr){
            System.out.println(obj);
        }
    }
}
