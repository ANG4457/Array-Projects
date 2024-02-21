import java.util.Scanner;


public class ATD3D{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter The Number Of Rows: ");
	int r = sc.nextInt();
	System.out.println("Enter The Number Of Columns: ");
	int c = sc.nextInt();
	System.out.println("Enter The Depth: ");
	int d = sc.nextInt();

	int[][][] Arr = new int[r][c][d];

	//Makes Array all 0//

	for(int i = 0; i < r; i++){
		for(int j = 0; j < c; j++){
			for(int n = 0; n < d; n++){
				Arr[i][j][n] = 0;
				}
			}
		}
	System.out.println("ROW COLUMN AND DEPTH INDICES START AT 0!");
	System.out.println("Enter The Row Index: ");
	int RI = sc.nextInt();
	System.out.println("Enter The Column Index: ");
	int CI = sc.nextInt();
	System.out.println("Enter The Depth Index: ");
	int DI = sc.nextInt();

	while(RI < 0 || RI >= r || CI < 0 || CI >= c || DI < 0 || DI >= d){
		System.out.println("INVALID INDEX! Enter New Indices");
		RI = sc.nextInt();
		CI = sc.nextInt();
		DI = sc.nextInt();

		}
	Arr[RI][CI][DI] = 1;

	//Shows the Array//

	System.out.println("This IS your Array: ");

	for(int i = 0; i < r; i++){
		for(int j = 0; j < c; j++){
			for(int n = 0; n < d; n++){
				System.out.println(Arr[i][j][n] + " ");
				}
			System.out.println();
			}
		}

// Shows Position //

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
	boolean quit = false;
	while(!quit){
		System.out.println("1: Pick A New 1 Position");
		System.out.println("2: QUIT!");
		System.out.println("CHOOSE ONE OF THE OPTIONS: ");
		int Choice = sc.nextInt();

		switch(Choice){
			case 1:
				System.out.println("Enter The Number Of Rows: ");
				r = sc.nextInt();
				System.out.println("Enter The Number Of columns: ");
				c = sc.nextInt();
				System.out.println("Enter The Depth: ");
				d = sc.nextInt();

				Arr = new int[r][c][d];
				for(int i = 0; i < r; i++){
					for(int j = 0; j < c; j++){
						for(int n = 0; n < d; n++){
							Arr[i][j][n] = 0;
							}
						}
					}

				System.out.println("ROW COLUMN AND DEPTH INDICES START AT 0!");
				System.out.println("Enter The Row Index: ");
				RI = sc.nextInt();
				System.out.println("Enter The Column Index: ");
				CI = sc.nextInt();
				System.out.println("Enter The Depth Index: ");
				DI = sc.nextInt();

				while(RI < 0 || RI >= r || CI < 0 || CI >= c || DI < 0 || DI >= d){
					System.out.println("INVALID INDEX! Enter New Indices");
					RI = sc.nextInt();
					CI = sc.nextInt();
					DI = sc.nextInt();

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