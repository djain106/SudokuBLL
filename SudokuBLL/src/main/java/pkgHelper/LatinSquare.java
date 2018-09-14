package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] myLatinSquare;
	
	public LatinSquare() {
		
	}
	
	public boolean ContainsZero() {

		if (myLatinSquare == null) {
			return false;
		}
		for(int iCol = 0; iCol < myLatinSquare.length; iCol++)
		{
			for(int iRow = 0; iRow < myLatinSquare.length; iRow++)
			{
				if (myLatinSquare[iCol][iRow] == 0)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		myLatinSquare = latinSquare;
	}
	
	public int[][] getLatinSquare() {
		return myLatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		myLatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int[] arr) {
		
		if (arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr [i+1]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean doesElementExist(int[] arr, int iValue){
		
		if (arr==null) {
			return false;
		}
		
		for (int i : arr) {
			if (i == iValue)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean hasAllValues(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null) {
			return false;
		}
		for (int i: arr1) {
			boolean contains = false;
			for (int j: arr2) {
				if (i == j) {
					contains = true;
				}
			}
			if (contains==false) {
				return contains;
			}
		}
		return true;
	}

	public int[] getColumn(int iCol) {
		int[] column = new int[myLatinSquare.length];
		for (int row = 0; row < myLatinSquare.length; row++) {
			column[row] = myLatinSquare[row][iCol];}
		return column;
	}
	
	public int[] getRow(int iRow) {

		int[] row = new int[myLatinSquare.length];
		for (int col = 0; col < myLatinSquare.length; col++) {
			row[col] = myLatinSquare[iRow][col];}
		return row;
	}
	
	public boolean isLatinSquare() {
		if (ContainsZero()==true) {
			return false;
		}
		for (int i = 0; i < myLatinSquare.length; i++) {
			int[] col = getColumn(i);
			if (hasDuplicates(col)==true) {
				return false;
			}
			for (int j = 0; j<myLatinSquare.length;j++) {
				int[] row = getRow(j);
				if (hasDuplicates(row)==true) {
					return false;
				}
				else if (hasAllValues(col,row)==false) {
					return false;
				}
			}
			
		}
		
		return true;
	}
}
