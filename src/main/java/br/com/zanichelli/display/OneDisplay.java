package br.com.zanichelli.display;

import br.com.zanichelli.display.cells.PipedCellFactory;
import br.com.zanichelli.display.cells.SpacedCellFactory;

public class OneDisplay implements IDisplay {

	private int size;

	public OneDisplay(int size) {
		this.size = size;
	}

	@Override
	public String levelOne() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory().createCell().display())
				.append(new SpacedCellFactory().createCell().display())
				.append(new SpacedCellFactory().createCell().display());

		return sb.toString();
	}

	@Override
	public String leveltwo() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory().createCell().display())
				.append(new PipedCellFactory().createCell().display())
				.append(new SpacedCellFactory().createCell().display());

		return sb.toString();
	}

	@Override
	public String levelthree() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory().createCell().display())
				.append(new PipedCellFactory().createCell().display())
				.append(new SpacedCellFactory().createCell().display());

		return sb.toString();
	}

	@Override
	public String levelfour() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory().createCell().display())
				.append(new PipedCellFactory().createCell().display())
				.append(new SpacedCellFactory().createCell().display());

		return sb.toString();
	}

	@Override
	public String levelfive() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory().createCell().display())
				.append(new SpacedCellFactory().createCell().display())
				.append(new SpacedCellFactory().createCell().display());

		return sb.toString();
	}

}
