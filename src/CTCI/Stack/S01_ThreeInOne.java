package src.CTCI.Stack;

import com.sun.jdi.InvalidStackFrameException;

public class S01_ThreeInOne {
    int[] arr;
    int index1;
    int index2;
    int index3;
    int size;

    S01_ThreeInOne(int n){
        this.arr = new int[3 * n];
        this.index1 = -1;
        this.index2 = n-1;
        this.index3 = 2*n-1;
        this.size = n;
    }

    public boolean isFull(int stackNum){
        switch (stackNum){
            case 1 -> {
                return index1 == size - 1;
            }
            case 2 ->{
                return index2 == 2*size-1;
            }
            case 3 -> {
                return index3 == 3*size-1;
            }
            default -> throw new InvalidStackFrameException();
        }
    }

    public void push(int stackNum, int val){

        if(isFull(stackNum)){
            throw new StackOverflowError();
        }


        if(stackNum == 1){
            arr[++index1] = val;
        } else if (stackNum == 2) {
            arr[++index2] = val;
        } else {
            arr[++index3] = val;
        }
    }

    public int pop(int stackNum){
        if(stackNum == 1){
            return arr[index1--];
        } else if (stackNum == 2) {
            return  arr[index2--];
        } else if(stackNum == 3){
            return arr[index3--];
        }

        throw new InvalidStackFrameException();
    }
}
