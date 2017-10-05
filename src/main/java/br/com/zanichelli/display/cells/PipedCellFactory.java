package br.com.zanichelli.display.cells;

public class PipedCellFactory implements ICellFactory {

	@Override
	public ICell createCell() {
		return new PipedCell();
	}

}
