package matrix;

/**
 * elke instantie van deze klasse stelt een (immutable) matrix voor, met een aantal rijen en een aantal kolommen en met als elementen kommagetallen(doubles)
 */

public class Matrix {
	
	/**
	 * deze methode geeft het aantal rijen van de matrix terug
	 * @pre this != null
	 * 
	 * @post this.getRows == this.rijen
	 * 
	 */
	public int getRows() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public int getColumns() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public double getElement(int row, int column) {
		throw new RuntimeException("Not yet implemented");
	}
	
	public int[] getMatrix_RMO() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public int[] getMatrix_CMO() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public int[] getMatrix_AOA() {
		throw new RuntimeException("Not yet implemented");
	}
	
	
	
	public Matrix scaled() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public Matrix plus(Matrix term) {
		throw new RuntimeException("Not yet implemented");
	}
	
}
