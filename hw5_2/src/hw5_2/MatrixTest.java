package hw5_2;

public class MatrixTest {
	public static void main(String[] args) {
		System.out.println("hw5_2: 김윤서 ");

		// 행렬 x, y의 곱을 구하여 출력
		int[][] x = {
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4}
		};

		int[][] y = {
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2}
		};

		int[][] z = MyMatrixService.multiply(x,  y);     
		MyMatrixService.print(z);
		System.out.println();

		// 행렬 a, b의 곱을 구하여 출력
		int[][] a = {
				{1, 1, 1},
				{2, 2, 2},
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] b = {
				{1, 1, 1, 1, -3},
				{1, 2, 3, 4, 5},
				{-2, 0, 6, 9, 12}
		};

		int[][] c = MyMatrixService.multiply(a,  b);     
		MyMatrixService.print(c);
	}


	public static class MyMatrixService {
		// (1) 정적 메소드 multiply를 작성하시오.
		// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
		// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨
		public static int[][] multiply(int a[][],int b[][]) {
			int[][] result= new int[a.length][b[0].length];
			for(int i=0;i<result.length;i++) {
				for (int j=0;j<result[i].length;j++) {
					for (int n=0;n<a[0].length;n++) {
						result[i][j]+=a[i][n]*b[n][j];
					}
				}
			}
			return result;
		}
		// (2) 정적 메소드 print를 작성하시오.
		// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력
		public static void print(int a[][]) {
			for(int i=0;i<a.length;i++) {
				System.out.print("\n\n");
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+"	");
				}
			}
		}
	}
}