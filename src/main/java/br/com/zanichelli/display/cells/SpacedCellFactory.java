package br.com.zanichelli.display.cells;

public class SpacedCellFactory implements ICellFactory {

	private int width;

	public SpacedCellFactory(int width) {
		this.width = width;
	}

	@Override
	public ICell createCell() {
		return new SpacedCell(width);
	}

}
