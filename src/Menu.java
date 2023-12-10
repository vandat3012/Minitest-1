import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            System.out.println("User name: ");
            String user0 = scanner.nextLine();
            String user1 = "admin";
            System.out.println("Password: ");
            String password0 = scanner.nextLine();
            String password1 = "123456";
            Boolean user = user0.equals(user1);
            Boolean password = password0.equals(password1);

            if (user && password) {
                System.out.println("Menu");
                System.out.println("1. Draw the rectangle");
                System.out.println("2. Draw the square");
                System.out.println("3. Draw the isosceles triangle");
                System.out.println("0. Exit");
                System.out.println("enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 0:
                        System.exit(0);
                    case 1:
                        System.out.println("enter width");
                        int widthRec = scanner.nextInt();
                        System.out.println("enter length");
                        int lengthRec = scanner.nextInt();
                        for (int i = 0; i < widthRec; i++) {
                            for (int j = 0; j < lengthRec; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("enter squared angle");
                        int squaredAngle = scanner.nextInt();

                        for (int i = 0; i < squaredAngle; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("enter width");
                        int bottomEdge = scanner.nextInt();
                        for (int i = 0; i < bottomEdge; i++) {
                            for (int j = bottomEdge - i; j > 0; j--) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < (2 * i + 1); k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                }
                break;
            } else {
                System.out.println("your user or password is wrong");
                count++;
            }
            if (count == 3) {
                System.out.println("You have entered more than 3 times");
                break;
            }
        }
    }
}
