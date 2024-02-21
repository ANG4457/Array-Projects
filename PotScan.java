import java.util.Scanner;

public class PotScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter " + (rows * columns) + " elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        boolean quit = false;
        while (!quit) {
            System.out.println("1. Find a number");
            System.out.println("2. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to find: ");
                    int target = sc.nextInt();
                    boolean found = false;
                    System.out.println("Position of the number in the array:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            if (array[i][j] == target) {
                                System.out.println("Found at position: (" + i + ", " + j + ")");
                                found = true;
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("The number " + target + " is not found in the array.");
                    }
                    break;
                case 2:
                    quit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        sc.close();
    }
}
