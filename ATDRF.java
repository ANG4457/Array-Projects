import java.util.Scanner;

public class ATDRF{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	boolean quit = false;
	while(!quit){
		System.out.println("1: Pick A New 1 Position");
		System.out.println("2: QUIT!");
		System.out.println("CHOOSE ONE OF THE OPTIONS: ");
		int Choice = sc.nextInt();

		switch(Choice){
			case 1:
				System.out.print("Input Desired Rows In Array: ");
				int r = sc.nextInt();
				System.out.print("Input Desire Columns In Array: ");
				int c = sc.nextInt();
				int[][] Arr = new int [r][c];

				for(int i = 0; i < r; i++){
					for(int j =0; j < c; j++){
						Arr[i][j] = 0;
					}
				}
				System.out.println("ROW AND COLUMN INDICES START AT 0!");
				System.out.println("Enter The Row Index: ");
				int RI = sc.nextInt();
				System.out.println("Enter The Column Index: ");
				int CI = sc.nextInt();
				while ( RI < 0 || RI >= r || CI < 0 || CI >= c){
					System.out.println("INVALID! ENTER VALID ROW AND COLUMN INDICES: ");
					RI = sc.nextInt();
					CI = sc.nextInt();
				}

				Arr[RI][CI] = 1;
				System.out.println("THIS IS YOUR ARRAY");

				for(int i = 0; i < r; i++){
					for(int j =0; j < c; j++){
						System.out.print(Arr[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println("The Position of the 1 is: ");
				for(int i = 0; i < r; i++){
					for(int j =0; j < c; j++){
						if (Arr[i][j] == 1){
							System.out.println("Target Found at (" + i + "," + j + ")");
						}
					}
				}
					// Allows User TO Convenantly End Program//

				break;
			case 2:
				quit = true;
				System.out.println("EXITING PROGRAM!");
				break;

			default:
				System.out.println("INVALID CHOICE! PICK AGAIN");

			}
		}

	sc.close();

	}
}