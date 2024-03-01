package matrix;

/**
 * elke instantie van deze klasse stelt een (immutable) matrix voor, met een aantal rijen en een aantal kolommen en met als elementen kommagetallen(doubles)
 */

public class Matrix {

	private int rows;
	private int columns;
	private double[] matrix;  //elementen intern opgeslagen in array RMO
	
	public Matrix(int rows, int columns, double[] matrix) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = matrix.clone();
	}
	
	public int getRows() {
		return this.rows;
	}
	
	public int getColumns() {
		return this.columns;
	}
	
	/*
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	
	public double getElement(int row, int column) {
		int i = row*getColumns()+column;
		return this.matrix[i];
	}
	
	public double[] getMatrix_RMO() {
		return this.matrix.clone();
	}
	
	public double[] getMatrix_CMO() {
		double[] newMatrix = new double[getRows()*getColumns()];
		int i = 0;
		for (int c=0; c<getColumns();c++) {
			for (int r = 0; r < getRows(); r++) {
				double element = getElement(r,c);
				newMatrix[i] = element;
				i += 1;
			}
		}
		return newMatrix;
	}
	
	public double[][] getMatrix_AOA() {
		double[][] newMatrix = new double[getRows()][getColumns()];
		for (int r=0; r<getRows();r++) {
			for (int c = 0; c < getColumns(); c++) {
				double element = getElement(r,c);
				newMatrix[r][c] = element;
			}
		}
		return newMatrix;
	}
	
	
	
	public Matrix scaled(int n) {
		double[] scaledMatrix = new double[getRows()*getColumns()];
		for (int i = 0; i < getRows()*getColumns(); i++) {
			double element = n*this.matrix[i];
			scaledMatrix[i] = element;
		}
		Matrix newMatrix = new Matrix(this.rows, this.columns, scaledMatrix);
		return newMatrix;

	}
	
	public Matrix plus(Matrix term) {
		double[] addedMatrix = new double[getRows()*getColumns()];
		int i = 0;
		for (int r=0; r<getRows();r++) {
			for (int c = 0; c < getColumns(); c++) {
				double element = this.getElement(r,c)+term.getElement(r, c);
				addedMatrix[i] = element;
				i += 1;}
		}
		Matrix newMatrix = new Matrix(this.rows, this.columns, addedMatrix);
		return newMatrix;
	}
	
}
	

