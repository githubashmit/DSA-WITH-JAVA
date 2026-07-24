package src.pepjavadsa;

public class printn {
    public void func(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        func(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        printn obj = new printn();
        obj.func(n);
    }
}
