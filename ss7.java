// import java.util.Scanner;

public class ss7 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("enter your number:");
        int count = 0;
        int i = 2;
        while (count<20) {if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
        }   i++;
    }
}

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
