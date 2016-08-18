package xirui.Practices;

public class TestLocation {
	public static void main(String[] args){
		int row=0,column=0;
		System.out.println("Enter the number of rows and columns of the array: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		row = input.nextInt();
		column = input.nextInt();
		System.out.println("Enter  the array: ");
		double[][] a = new double[row][column];
		for(int i = 0;i<row;i++)
			for(int j = 0;j<column;j++)
				a[i][j] = input.nextDouble();
		Location test = null;
		test = Location.locateLargest(a);
		System.out.println("The location of the largest element is " +test.maxValue + " at(" + test.row + "," + test.column + ")");
	}
}
