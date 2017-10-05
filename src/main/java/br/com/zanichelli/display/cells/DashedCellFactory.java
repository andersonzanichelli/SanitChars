package br.com.zanichelli.display.cells;

public class DashedCellFactory implements ICellFactory {

	@Override
	public ICell createCell() {
		return new DashedCell();
	}


}
