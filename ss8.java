import java.util.Scanner;

public class ss8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int choice = 0;
        while (true) {
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 khôn");
            System.out.println(" 4. Thoat");
            System.out.println("moi ban nhap so");
            int choice = scanner.nextInt();
            switch (choice) {
            case 1:
                System.out.println("enter your number: ");
                int number = scanner.nextInt();
                if (number%2==0) {System.out.println(" there are number even");
                } else System.out.println("there are not number even");
                break;
                case 2:
                System.out.println("enter your number: ");
                int number1 = scanner.nextInt();
                if (number1%2!=0) {System.out.println(" there are number even");
                } else System.out.println("there are not number even");
                    break;
                case 3:
                System.out.println("enter your number: ");
                int number2 = scanner.nextInt();
                if (number2%3==0) {System.out.println("number divisible by 3 ");
                } else System.out.println("number not divisible by 3");
                break;
            case 4:
                System.out.println("ban da thoat");
                scanner.close();
                System.exit(0);
                break;
                    default:
                break;
        }
        }
        
    }
    
}
