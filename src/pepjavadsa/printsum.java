package src.pepjavadsa;

public class printsum {
    int sum=0;
    public void sum(int n){
        sum=sum+n;
        if(n==1){
            return;
        };
        sum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        printsum obj = new printsum();
        obj.sum(n);
        System.out.println(obj.sum);
    }
}
