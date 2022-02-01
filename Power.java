import java.util.Scanner;

public class Power {
    static int power(int a, int b){
        if (b == 0 ){
            return 1;
        }
        return power(a,b-1)*a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        int a = input.nextInt();
        System.out.print("Exponent: ");
        int b = input.nextInt();

        System.out.println("Conclusion = " + power(a,b));
    }
}
