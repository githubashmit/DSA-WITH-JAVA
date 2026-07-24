package src.pepjavadsa;

public class printntoone {
    public void func(int n){
        System.out.println(n);
        if(n==1){
            return;
        }
        func(n-1);

    }

    public static void main(String[] args) {
        int n=10;
        printntoone obj = new printntoone();
        obj.func(n);
    }
}
