package br.com.zanichelli.display.cells;

public class DashedCellFactory implements ICellFactory {

	private int width;

	public DashedCellFactory(int width) {
		this.width = width;
	}

	@Override
	public ICell createCell() {
		return new DashedCell(width);
	}


}
