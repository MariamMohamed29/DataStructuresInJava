public class RecursionDemo {
    static int fact(int num){
        if(num==0)
            return 1;
        else {
            System.out.println("fact("+num+")= "+num+" * fact("+(num-1)+")");
            return num*fact(num-1);
        }

    }
    public static void main(String[] args){
        System.out.println("the result = "+fact(4));
    }
}
