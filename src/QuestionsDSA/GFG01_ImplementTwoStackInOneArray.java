package src.QuestionsDSA;

public class GFG01_ImplementTwoStackInOneArray {
        int[] arr;
        int index1;
        int index2;
    GFG01_ImplementTwoStackInOneArray(){
            arr= new int[200];
            index1= -1;
            index2= 99;
        }
        void push1(int x){
            arr[++index1] = x;
        }
        void push2(int x){
            arr[++index2] = x;
        }
        int pop1(){
            return (index1== -1) ? -1 : arr[index1--];
        }
        int pop2(){
            return (index2 == 99) ? -1 : arr[index2--];
        }

    public static void main(String[] args) {
        GFG01_ImplementTwoStackInOneArray stacks = new GFG01_ImplementTwoStackInOneArray();
        stacks.push1(5);
        stacks.push1(10);
        stacks.push1(15);

        stacks.push2(20);
        stacks.push2(25);
        stacks.push2(30);
        System.out.println("Popped element from stack 1: " + stacks.pop1()); // Output: 15
        System.out.println("Popped element from stack 1: " + stacks.pop1()); // Output: 10
        System.out.println("Popped element from stack 1: " + stacks.pop1()); // Output: 5
        System.out.println("Popped element from stack 1: " + stacks.pop1()); // Output: -1 (Empty stack)

        System.out.println("Popped element from stack 2: " + stacks.pop2()); // Output: 30
        System.out.println("Popped element from stack 2: " + stacks.pop2()); // Output: 25
        System.out.println("Popped element from stack 2: " + stacks.pop2()); // Output: 20
        System.out.println("Popped element from stack 2: " + stacks.pop2());
    }
}
