package src.pepjavadsa;

public class reversestringusingrecursion {
    public String reverse(String a){
        int size = a.length();


        if (size == 1) {
            return a;
        }
        return a.charAt(size - 1) + reverse(a.substring(0, size - 1));
    }
    public static void main(String[] args) {
        String k = "ashmit";
        reversestringusingrecursion obj = new reversestringusingrecursion();
        System.out.println(obj.reverse(k));
    }
}
