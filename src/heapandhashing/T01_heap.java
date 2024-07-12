package src.heapandhashing;

public class T01_heap {
    void insert(int A[] , int n){
        int temp ,i =n;
        temp = A[n];
        while(i>1 && temp > A[i/2]){
            A[i] = A[i/2];
            i=i/2;
        }
        A[i] = temp;
    }
    void createHeap(){
        int A[] ={0,10,20,30,25,5,40,35};
        int i;
        for(i=2;i<=7 ; i++){
            insert(A,i);
        }
    }
    void delete(int A[] , int n){
        int x;
        int i=1;
        int j;
        x=A[n];
        A[i] = A[n];
        i=1;j=2*i;
        while(j<n-1){
            if(A[j+1] > A[j]){
                j=j+1;
            }
            if(A[i] < A[j]){
                swap(A[i] , A[j]);
                i=j;
                j=2*j;
            }else{
                break;
            }
        }
        A[n] = x;
    }
    void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {
        T01_heap obj = new T01_heap();
        obj.createHeap();
    }
}
