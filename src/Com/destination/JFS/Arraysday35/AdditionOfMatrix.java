package Com.destination.JFS.Arraysday35;

import java.util.Scanner;

public class AdditionOfMatrix {
	int mat1[][];
	int mat2[][];
	int res[][];
	Scanner sc=new Scanner(System.in);
	public void createMatrix(int n) {
		mat1=new int[n][n];
		mat2=new int[n][n];
		res=new int[n][n];
		System.out.println("Matrices are created.");
		System.out.println("===========================================");
	}
	public void collectData() {
		System.out.println("Collection data for first matrix:");
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("Collection data for second matrix:");
		for(int i=0;i<mat2.length;i++) {
			for(int j=0;j<mat2[i].length;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Data is collected in to the matrix:");
		System.out.println("===========================================");
	}
	public void addMatrix() {
		System.out.println("Calculating the sum of matrix:");
		for(int i=0;i<mat2.length;i++) {
			for(int j=0;j<mat2[i].length;j++) {
				res[i][j]=mat2[i][j]+mat1[i][j];
			}
		}
		System.out.println("Sum is added to the resultant matrix");
		System.out.println("===========================================");
	}
	public void displayresult(){
		System.out.println("The result is :");
		for(int i=0;i<mat2.length;i++) {
			for(int j=0;j<mat2.length;j++) {
				System.out.print(res[i][j]+"    ");
			}
			System.out.println();
		}
		
	}
public class Matrix{
	public static void main(String[] args) {
		AdditionOfMatrix aom=new AdditionOfMatrix();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix size : ");
		int n=sc.nextInt();
		System.out.println("----------------------------");
		aom.createMatrix(n);
		aom.collectData();
		aom.addMatrix();
		aom.displayresult();
	}
}
	

}
