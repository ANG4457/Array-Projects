// ANOTHER UPDATE TO ATD, THIS PROGRAM ALLOWS USER TO USE THE SAME ARRAY AND FIND A RANDOM 1 IN THE ARRAY


import java.util.Scanner;
import java.util.Random;

public class RATDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random RN = new Random();

        boolean quit = false;
        int[][][] Arr = null;

        while (!quit) {
            System.out.println("1: Create Array");
            System.out.println("2: Find 1 and Randomize 0");
            System.out.println("3: QUIT!");
            System.out.println("CHOOSE ONE OF THE OPTIONS: ");
            int Choice = sc.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("Enter The Number Of Rows: ");
                    int r = sc.nextInt();
                    System.out.println("Enter The Number Of columns: ");
                    int c = sc.nextInt();
                    System.out.println("Enter The Depth: ");
                    int d = sc.nextInt();
                    Arr = new int[r][c][d];

                    // Initialize array with all zeros
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            for (int k = 0; k < d; k++) {
                                Arr[i][j][k] = 0;
                            }
                        }
                    }


					int RI = RN.nextInt((r-1));

					int CI = RN.nextInt((c-1));

					int DI = RN.nextInt((d-1));

					while(RI < 0 || RI >= r || CI < 0 || CI >= c || DI < 0 || DI >= d){

						RI = RN.nextInt((r-1));
						CI = RN.nextInt((c-1));
						DI = RN.nextInt((d-1));

						}

					Arr[RI][CI][DI] = 1;

                    break;
                case 2:
                    if (Arr == null) {
                        System.out.println("Please create an array first.");
                        break;
                    }

                    // Find 1 and Randomize 0
                    boolean oneFound = false;
                    int oldRI = -1, oldCI = -1, oldDI = -1;
                    for (int i = 0; i < Arr.length; i++) {
                        for (int j = 0; j < Arr[0].length; j++) {
                            for (int k = 0; k < Arr[0][0].length; k++) {
                                if (Arr[i][j][k] == 1) {
                                    oldRI = i;
                                    oldCI = j;
                                    oldDI = k;
                                    oneFound = true;
                                    break;
                                }
                            }
                            if (oneFound) break;
                        }
                        if (oneFound) break;
                    }

                    if (!oneFound) {
                        System.out.println("1 not found in the array.");
                        break;
                    }

                    // Randomly change one input to 0
                    int newRI, newCI, newDI;
                    do {
                        newRI = RN.nextInt(Arr.length);
                        newCI = RN.nextInt(Arr[0].length);
                        newDI = RN.nextInt(Arr[0][0].length);
                    } while (newRI == oldRI && newCI == oldCI && newDI == oldDI);

                    Arr[oldRI][oldCI][oldDI] = 0;
                    Arr[newRI][newCI][newDI] = 1;

                    // Displaying array
                    System.out.println("Array after randomizing:");
                    for (int i = 0; i < Arr.length; i++) {
                        for (int j = 0; j < Arr[0].length; j++) {
                            for (int k = 0; k < Arr[0][0].length; k++) {
                                System.out.print(Arr[i][j][k] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }

                    // Find 1 position
                    System.out.println("Position Of The 1 is: ");
                    System.out.println("Target Was Found at: (" + newRI + "," + newCI + "," + newDI + ")");
                    break;
                case 3:
                    quit = true;
                    System.out.println("Exiting The Program!");
                    break;
                default:
                    System.out.println("INVALID CHOICE! Pick Again");
            }
        }
        sc.close();
    }
}
