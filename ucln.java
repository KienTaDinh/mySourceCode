import java.util.Scanner;

public class ucln {
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0){
            return a+b;
        }
        while (a != b) {
            if (a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        int c = gcd (a, b);
        System.out.println(c);
    }
}