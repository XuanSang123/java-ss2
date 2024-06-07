import java.util.Scanner;
 
 public class ss1 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.println("enter your number check:");
int number = scanner.nextInt();
if (number % 3 == 0 && number % 5 == 0) {
    System.out.println("number divisible by 3 and 5");
} else if (number % 3 == 0) {
    System.out.println("number divisible by 3");
} else if (number % 5 == 0) {
    System.out.println("number divisible by 5");
} else {System.out.println("There is no number divisible by 3 and 5");}
    }
}
