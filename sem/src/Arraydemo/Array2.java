package Arraydemo;

public class Array2 {
	int arr1[][]=new int [3][2];
	int arr2[][]= {{1,2,3},{4,5,6}};
	int arr3[][] = new int[5][] ;{  // Create 2D array with 5 rows

    arr3[0] = new int[2];
    arr3[1] = new int[3];
    arr3[2] = new int[4];
    arr3[3] = new int[5];
    arr3[4] = new int[2];
    }
    
	public Array2() {
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
				this.arr1[i][j]=(i+1)*(j+1);
		}
	}
	
	void print(int arr[][]) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	
}
