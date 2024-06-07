import java.util.Scanner;

public class ss4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your math");
        float math = scanner.nextFloat();
        System.out.println("enter your physics");
        float physics = scanner.nextFloat();
        System.out.println("enter your chemistry");
        float chemistry = scanner.nextFloat();
        System.out.println("enter your literature");
        float literature = scanner.nextFloat();
        System.out.println("enter your english");
        float english = scanner.nextFloat();
        float averaged = (math + physics + chemistry + literature + english) / 5;
        if (averaged<5) {System.out.println("brain dog");
        } else if (averaged >= 5 && averaged < 6.5) {
            System.out.println("rank medium");
        }else if (averaged >= 6.5 && averaged < 8) {
            System.out.println("rank good");
        }else if (averaged >= 8 && averaged < 9) {
            System.out.println("rank very good");
        } else {System.out.println("rank excellent");}
    }
    
}
