package hw5_2;

public class MatrixTest {
	public static void main(String[] args) {
		System.out.println("hw5_2: ������ ");

		// ��� x, y�� ���� ���Ͽ� ���
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

		// ��� a, b�� ���� ���Ͽ� ���
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
		// (1) ���� �޼ҵ� multiply�� �ۼ��Ͻÿ�.
		// ������ ���� �迭�� ǥ���� �ΰ��� ����� �Ű������� �޾� ���� ���� ����� ������ ���� �迭�� ǥ���Ͽ� ����
		// �Ű������� ���� �� ����� ���� ���ϱ⿡ Ÿ���� ũ���� �����ص� ��
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
		// (2) ���� �޼ҵ� print�� �ۼ��Ͻÿ�.
		// ������ ���� �迭�� ǥ���� �ϳ��� ����� �Ű������� �޾� �� �ٿ� �� �྿ ���
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