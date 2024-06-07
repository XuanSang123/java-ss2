import java.util.Scanner;

public class ss5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number1 start: ");
        int number1 = scanner.nextInt();
        System.out.println("enter your number2 start: ");
        int number2 = scanner.nextInt();
                int sum = 0;

        for (int i = number1; i <= number2; i++) {

            if (i % 2 == 0) {
                sum += i;
            }
        }
            System.out.println("Tong" + sum);
    
    }
    }
