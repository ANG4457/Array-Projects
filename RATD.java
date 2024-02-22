//SAME AS ATD3DRF, however this program completely randomizes the position of the 1 and has the computer choose, this allows for higher proformance//


import java.util.Scanner;
import java.util.Random;

public class RATD{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Random RN = new Random();

		boolean quit = false;
		while(!quit){
			System.out.println("1: Pick A New 1 Position");
			System.out.println("2: QUIT!");
			System.out.println("CHOOSE ONE OF THE OPTIONS: ");
			int Choice = sc.nextInt();

			switch(Choice){
				case 1:
					System.out.println("Enter The Number Of Rows: ");
					int r = sc.nextInt();
					System.out.println("Enter The Number Of columns: ");
					int c = sc.nextInt();
					System.out.println("Enter The Depth: ");
					int d = sc.nextInt();

					int[][][] Arr = new int[r][c][d];
					for(int i = 0; i < r; i++){
						for(int j = 0; j < c; j++){
							for(int n = 0; n < d; n++){
								Arr[i][j][n] = 0;
								}
							}
						}

					System.out.println("ROW COLUMN AND DEPTH INDICES START AT 0!");
					System.out.println("Enter The Row Index: ");
					int RI = RN.nextInt((r-1));
					System.out.println("Enter The Column Index: ");
					int CI = RN.nextInt((c-1));
					System.out.println("Enter The Depth Index: ");
					int DI = RN.nextInt((d-1));

					while(RI < 0 || RI >= r || CI < 0 || CI >= c || DI < 0 || DI >= d){
						System.out.println("INVALID INDEX! Enter New Indices");
						RI = RN.nextInt((r-1));
						CI = RN.nextInt((c-1));
						DI = RN.nextInt((d-1));

						}

					Arr[RI][CI][DI] = 1;

					System.out.println("This IS your Array: ");

					for(int i = 0; i < r; i++){
						for(int j = 0; j < c; j++){
							for(int n = 0; n < d; n++){
								System.out.println(Arr[i][j][n] + " ");
								}
								System.out.println();
							}
						}
					System.out.println("Position Of The 1 is: ");
					for(int i = 0; i < r; i++){
						for(int j = 0; j < c; j++){
							for(int n = 0; n < d; n++){
								if(Arr[i][j][n] == 1){
									System.out.println("Target Was Found at: (" + i + "," + j + "," + n + ")");
									}
								}
							}
						}

					break;
					case 2:
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