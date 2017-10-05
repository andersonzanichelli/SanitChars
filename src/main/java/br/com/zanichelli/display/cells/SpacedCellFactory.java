package br.com.zanichelli.display.cells;

public class SpacedCellFactory implements ICellFactory {

	@Override
	public ICell createCell() {
		return new SpacedCell();
	}

}
