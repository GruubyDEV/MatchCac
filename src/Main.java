import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int chose;
        Math math = new Math();

        do {
            Thread.sleep(1000);

            System.out.println("Welcome in MathCalc");
            System.out.println("What you want to do?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Chose: ");
            chose = scan.nextInt();

            switch (chose) {
                case 1 -> System.out.println("Sum is: " + math.sum());
                case 2 -> System.out.println("Sub is: " + math.sub());
                case 3 -> System.out.println("Multi is: " + math.multi());
                case 4 -> System.out.println("Div is: " + math.div());
                case 0 -> {
                    System.out.println("Thanks for using MathCalc! Bye!");
                    Thread.sleep(1000);
                }
            }
        } while (chose != 0);

    }
}