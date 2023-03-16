import java.util.Scanner;

public class Math {
    private int sum, sub, multi, div, x, y;
    Scanner scan = new Scanner(System.in);

    int sum() {

        do {
            System.out.print("Put number (If you want sum these numbers, put 0): ");
            x = scan.nextInt();
            sum+=x;
        } while (x != 0);

        return sum;
    }
    int sub() {

        System.out.println("Put first number from which you will subtract: ");
        sub = scan.nextInt();
        do {
            System.out.println("Put another number to subtract (If you want sub these numbers, put 0): ");
            x = scan.nextInt();
            sub-=x;
        } while (x != 0);

        return sub;
    }
    int multi() {
        do {
            System.out.print("Put number (If you want multi these numbers, put 0): ");
            x = scan.nextInt();
            multi*=x;
        } while (x != 0);

        return multi;
    }
    int div() {
        System.out.println("Put first number: ");
        x = scan.nextInt();
        System.out.println("Put second number: ");
        y = scan.nextInt();

        if(x > y) {
            div = x / y;
        } else {
            div = y / x;
        }

        return div;
    }
}
