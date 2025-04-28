package Com.destination.JFS.Arraysday35;

import java.util.Scanner;

public class IdentityMatrix {
	
	int arr[][];
	Scanner sc=new Scanner(System.in);
	
	public void createMatrix(int n) {
		System.out.println("Enter the size.");
	    int n1=sc.nextInt();
		arr=new int[n1][n1];
	}
	public void collectData() {
		System.out.println("Collection the  matrix:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	int checkIdentity() {
		System.out.println("checking the identity matrix:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					if(arr[i][j] !=1) {
						return 0;
					}
				}
				else {
					if(arr[i][j] !=0) {
						return 0;
					}
				}
			}
	}
		return 1;
}
public class IdentityMatrix1 {
	public static void main(String[] args) {
		MatrixCheck  mc=new MatrixCheck();
		
	}
}
}

