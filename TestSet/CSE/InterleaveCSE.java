package cs243;

public class InterleaveCSE {

    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
        int x = a + b;
	a = 3;
	b = 4;
	int y = a + b;
	a = 5;
	b = 6;
	int z = a + b;
        System.out.println(x + y + z);
    }

}