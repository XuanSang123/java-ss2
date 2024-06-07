import java.util.Scanner;
public class ss6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (true) {
            if (i % 5 == 0 && i % 7 == 0 && i % 11 == 0) {
            System.out.println("number divisible by 5 and 7 and 11: " + i);
            break;
        }
           i++; 
        }
            }
}
