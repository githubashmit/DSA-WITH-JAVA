package src.heapandhashing;

public class T02_headsort {
    void insert(int H[], int n ){
        int i=n,temp;
        temp = H[i];
        while(i>1 && temp >H[i/2]){
            H[i]=H[i/2];
            i=i/2;
        }
        H[i] = temp;
    }
    int Delete(int A[] , int n){
        int i,j,x,val;
        val =A[1];
        x=A[n];
        A[1] = A[n];
        A[n] = val;
        i=1; j=i*2;
        while(j<n-1){
            if(A[j+1] > A[j]){
                j=j+1;
            }
            if(A[i] < A[j]){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i=j;
                j=2*j;
            }else{
                break;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        int H[] = {0,10,20,30,25,5,40,35};
        int i;
        T02_headsort obj = new T02_headsort();
        for(i = 2;i<=7 ;i++){
            obj.insert(H , i);
        }
        System.out.println("Deleted value is "+obj.Delete(H , 7));
        for(i=1;i<=7;i++){
            System.out.println(H[i]+" ");
        }

    }
}
