package Com.destination.JFS.Arraysday35;

import java.util.Scanner;

public class MultiplicationOfMatrix {
		int mat1[][];
		int mat2[][];
		int res[][];
		Scanner sc=new Scanner(System.in);
		public void createMatrix() {
			System.out.println("enter the size of matrix : ");
			int n=sc.nextInt();
			mat1 = new int[n][n];
			mat2 = new int[n][n];
			res = new int[n][n];
			System.out.println("Matrices are created");
			System.out.println("--------------------------------");
		}
		public void collectData() {
			System.out.println("Collecting data for matrix-1");
			for(int i=0;i<mat1.length;i++) {
				for(int j=0;j<mat1.length;j++) {
					mat1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Data for matrix -1 is collected and stored");
			System.out.println("----------------");
			System.out.println("collecting data for matrix -2 ");
			for(int i=0;i<mat2.length;i++) {
				for(int j=0;j<mat2.length;j++) {
					mat2[i][j]=sc.nextInt();
				}
			}
			System.out.println("Data for matrix -2 is collected and stored");
			System.out.println("----------------");
		}

	public void findProd() {
		System.out.println("Calculating the result");
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				for(int k=0;k<mat1.length;k++) {
					res[i][j]=res[i][j]+(mat1[i][k]*mat2[k][j]);
				}
				}
			}
		System.out.println("Result is calculated and stored");
		System.out.println("---------------");
		
	}
	public void displayResult() {
		System.out.println("The resultant matrix is");
		for(int i=0;i<res.length;i++) { 
			for(int j=0;j<res[i].length;j++) {
				System.out.println(res[i][j]);
			}
			System.out.println();
		}
	}

	public class MatrixMultiplication {
		public static void main(String[] args) {
			MultiplicationOfMatrix mo=new MultiplicationOfMatrix();
			mo.createMatrix();
			mo.collectData();
			mo.findProd();
			mo.displayResult();
			
		}
			
		}

	

}
