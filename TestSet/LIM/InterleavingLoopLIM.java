package cs243;

public class InterleavingLoopLIM {

    public static void main(String[] args) {
        int a = 1;
        int x = 0;
        for(int i = 0; i < 3; i++){
            a = i + 1;
            x = a;
        }
        System.out.println(x);
    }

}