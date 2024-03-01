package matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTest {

	@Test
	void test() {
		double[] elements = new double[] {1,0,0,0,1,0,0,0,1};
		Matrix eenheid = new Matrix(3,3,elements);
		assertEquals(eenheid.getRows(), 3);
		assertEquals(eenheid.getColumns(),3);
		assertEquals(eenheid.getElement(2, 2),1);
		assertEquals(eenheid.getElement(0, 0),1);
		assertEquals(eenheid.getElement(1,0),0);
		elements[0] = 2;
		assertEquals(eenheid.getElement(0, 0),1);
		assertArrayEquals(eenheid.getMatrix_RMO(),eenheid.getMatrix_CMO());
		
		double[] elements2 = new double[] {1,2,3,4,5,6};
		Matrix test = new Matrix(2,3,elements2);
		Matrix term = new Matrix(2,3,elements2);
		assertArrayEquals(test.getMatrix_RMO(), elements2);
		double[] elements2CMO = new double[] {1,4,2,5,3,6};
		assertArrayEquals(test.getMatrix_CMO(),elements2CMO);
		double[][] elements2AOA = new double[][] {{1,2,3},{4,5,6}};
		assertArrayEquals(elements2AOA,test.getMatrix_AOA());
		
		assertEquals(test.scaled(2).getElement(0, 0),2);
		assertEquals(test.scaled(2).getElement(1, 0),8);

		assertEquals(test.plus(term).getElement(0, 0),2);
		assertEquals(test.plus(term).getElement(1, 0),8);
		
	}

}
