import java.util.Scanner;

public class Lab2Question1 {

    public static void main(String[] args) {
        int a;
        int b;
        double c;
        double d;
        a = -5 + 8 * 6;
        b = (55 + 9) % 9;
        c = 20 + -3 * 5.0 / 8;
        d = 5 + 15 / 3.0 * 2 - 8 % 3;

        Scanner input = new Scanner(System.in);
        System.out.println("a) -5 + 8 * 6 = " + a);
        System.out.println("b) (55 + 9) % 9 = " + b);
        System.out.println("c) 20 + -3 * 5.0 / 8 = " + c);
        System.out.println("d) 5 + 15 / 3.0 * 2 - 8 % 3 = " + d);
    }
}