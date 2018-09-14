package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicate_test1() {
		
		int [] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		}
	
	@Test
	
	public void hasDuplicate_test2() {
		
		int [] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		}
	
	@Test
	
	public void hasDuplicate_test3() {
		
		int [] arr = {1,2,3,4,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		}
	
	@Test
	
	public void hasDuplicate_test4() {
		
		int [] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		}
	
	@Test
	
	public void hasDuplicate_test5() {
		
		int [] arr = {};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	
	public void doesElementExist_Test1() {
		int [] arr = {1,2,3,4,5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr,iValue));
	}
	
	@Test
	
	public void doesElementExist_Test2() {
		int [] arr = {1,2,3,4,5,};
		int iValue = 99;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr,iValue));
	}
	
	@Test
	
	public void doesElementExist_Test3() {
		int [] arr = null;
		int iValue = 1;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr,iValue));
	}
	
	@Test
	
	public void ContainsZeroTest() {
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertFalse(ls.ContainsZero());
	}
	
	@Test
	
	public void ContainsZeroTest2() {
		int[][] mySquare = {{1,2,0},{3,1,2},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertTrue(ls.ContainsZero());
	}
	
	@Test
	
	public void ContainsZeroTest3() {
		int[][] mySquare = null;
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertFalse(ls.ContainsZero());
	}
	
	@Test
	
	public void hasAllValuesTest1() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1, arr2));
				
	}
	
	@Test
	
	public void hasAllValuesTest2() {
		int[] arr1 = {1,2,3,4,6};
		int[] arr2 = {1,2,3,4,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));
				
	}
	
	@Test
	
	public void hasAllValuesTest3() {
		int[] arr1 = null;
		int[] arr2 = {1,2,3,4,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));
				
	}
	
	@Test
	
	public void getColumnTest1() {
		int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
		
		LatinSquare lq = new LatinSquare(arr);
		int[] arr1 = {1,1,1};
		
		assertTrue(Arrays.equals(lq.getColumn(0), arr1));
	}
	
	@Test
	
	public void getRowTest1() {
		int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
		
		LatinSquare lq = new LatinSquare(arr);
		int[] arr1 = {1,2,3};
		
		assertTrue(Arrays.equals(lq.getRow(0), arr1));
	}
	
	@Test
	
	public void getRowTest2() {
		int[][] arr = {{1,1,1},{2,2,2},{3,3,3}};
		
		LatinSquare lq = new LatinSquare(arr);
		int[] arr1 = {1,1,1};
		
		assertTrue(Arrays.equals(lq.getRow(0), arr1));
	}
	
	@Test
	
	public void isLatinSquareTest1() {
		int[][] arr = {{1,2,3},{2,3,1},{3,1,2}};
		
		LatinSquare lq = new LatinSquare(arr);
		
		assertTrue(lq.isLatinSquare());
	}
	
	@Test
	
	public void isLatinSquareTest2() {
		int[][] arr = {{1,1,1},{3,2,1},{1,1,2}};
		
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	
	public void isLatinSquareTest3() {
		int[][] arr = {{1,2,2},{4,5,6},{7,8,9}};
		
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	
	public void isLatinSquareTest4() {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	
	public void isLatinSquareTest5() {
		int[][] arr = {{1,2,0},{4,5,6},{7,8,9}};
		
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.isLatinSquare());
	}

}
