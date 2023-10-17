import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackDemo {
    //pushing elements on the top of the stack
    static void stackPush(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
    }
    //popping elements from the top of the stack
    static void stackPop(Stack<Integer> stack){
        System.out.println("Pop Operation:");
        for (int i=0;i<5;i++){
            int y=stack.pop();
            System.out.println(y);
        }
    }
    
    // Displaying element on the top of the stack
    static void stackPeek(Stack<Integer> stack){
        int y=stack.peek();
        System.out.println("the to element of the stack is "+y);
    }
    // Searching element in the stack
    static void stackSearch(Stack<Integer> stack,int element){
        int pos=stack.search(element);
        if(pos==-1){
            System.out.println("element not found");
        }else{
            System.out.println("Element is found at position "+pos);
        }
    }
    public static void main(String[] args) {
        //default initialization of stack
        Stack stack1=new Stack();
        //Initialization of stack using generic
        Stack<Integer> stack2 = new Stack<Integer>();
        stackPush(stack2);
        stackPop(stack2);
        stackPush(stack2);
        stackPeek(stack2);
        stackSearch(stack2,4);
        stackSearch(stack2,7);
    }
}
