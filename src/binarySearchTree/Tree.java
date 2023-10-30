package binarySearchTree;

public class Tree {
    MyNode root;

    boolean find (int searchKey){
        MyNode current=root;
        // move current to left or right
        while (current.data!=searchKey){
            if(searchKey>current.data){
                current=current.rightChild;
            }
            else {
                current=current.leftChild;
            }
            //not found
            if(current==null){
                return false;
            }
        }
        return true;
    }
    void insert(int data){
        MyNode newNode=new MyNode(data);
        if (root==null){
            root=newNode;
        }else {
            MyNode current=root;
            MyNode parent;
            while (true){
                parent=current;
                if (data<current.data){
                    current=current.leftChild;
                    if(current==null){
                        parent.leftChild=newNode;
                        return;  //exit
                    }
                }else {
                    current=current.rightChild;
                    if (current==null){
                        parent.rightChild=newNode;
                        return;  //exit
                    }
                }
            }
        }
    }
     int findMax(){
        MyNode current=root;
        while (current.rightChild != null) {
            current = current.rightChild;
        }
        return current.data;
    }
    int findMin(){
        MyNode current=root;
        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current.data;
    }
    // left<root<right
    public void inOrder(MyNode localRoot){
        if(localRoot != null){
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.data);
            inOrder(localRoot.rightChild);
        }
    }
    //root<left<right
    public void preOrder(MyNode localRoot){
        if(localRoot != null){
            System.out.println(localRoot.data);
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    public void postOrder(MyNode localRoot){
        if(localRoot != null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.println(localRoot.data);
        }
    }
    public static void main(String[] args){
        Tree myTree=new Tree();
        myTree.insert(100);
        myTree.insert(99);
        myTree.insert(105);
        myTree.insert(40);
        myTree.insert(230);
        myTree.insert(20);
        myTree.insert(23);
        System.out.println(myTree.find(100));
        System.out.println("-------------");
        System.out.println("the max value is : "+myTree.findMax());
        System.out.println("-------------");
        System.out.println("the min value is : "+myTree.findMin());
        System.out.println("-------------");
        myTree.inOrder(myTree.root);
        System.out.println("-------------");
        myTree.preOrder(myTree.root);
        System.out.println("-------------");
        myTree.postOrder(myTree.root);

    }
}
