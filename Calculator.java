import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number\n 1 for +, 2 for -, 3 for *, 4 for /, 5 for !n, 6 for **");
        int value = sc.nextInt();
        switch (value){
            case 1:
                System.out.println("Please enter first num");
                int x = sc.nextInt();
                System.out.println("Please enter second num");
                int y = sc.nextInt();

                System.out.println("The answer is: " + (x + y));
                break;

            case 2:
                System.out.println("Please  enter first num");
                int a = sc.nextInt();
                System.out.println("Please enter second num");
                int b = sc.nextInt();

                System.out.println("The answer is: " + (a - b));
                break;

            case 3:
                System.out.println("Please  enter first num");
                int c = sc.nextInt();
                System.out.println("Please enter second num");
                int d = sc.nextInt();

                System.out.println("The answer is: " + c * d);
                break;

            case 4:
                System.out.println("Please enter first num");
                int e = sc.nextInt();
                System.out.println("Please enter second num");
                int f = sc.nextInt();

                System.out.println("The answer is: " + e / f);
                break;

            case 5:
                System.out.println("Please enter num");
                int n = sc.nextInt();

                if (n <= 0){
                    System.out.println("Undefined.");
                    break;
                }

                long factorial = calculateFactorial(n);
                System.out.println("The answer is: " + factorial);
                break;

            case 6:
                System.out.println("please enter base num");
                int g = sc.nextInt();
                System.out.println("Please enter power num");
                int p = sc.nextInt();

                System.out.println("The answer is: " + Math.pow(g, p));
                break;

            default:
                System.out.println("WTF?");
                break;
        }
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Undefined.");
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}