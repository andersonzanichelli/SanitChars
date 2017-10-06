package br.com.zanichelli.display;

import br.com.zanichelli.display.cells.DashedCellFactory;
import br.com.zanichelli.display.cells.PipedCellFactory;
import br.com.zanichelli.display.cells.SpacedCellFactory;

public class ThreeDisplay implements IDisplay {

	private int width;
	private int height;

	public ThreeDisplay(int size, int height) {
		this.width = size;
		this.height = height;
	}

	@Override
	public String levelOne() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory(width).createCell().display())
				.append(new DashedCellFactory(width).createCell().display())
				.append(new SpacedCellFactory(width).createCell().display());

		return sb.toString();
	}

	@Override
	public String leveltwo() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory(width).createCell().display())
				.append(new SpacedCellFactory(width).createCell().display())
				.append(new PipedCellFactory().createCell().display());

		return sb.toString();
	}

	@Override
	public String levelthree() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory(width).createCell().display())
				.append(new DashedCellFactory(width).createCell().display())
				.append(new SpacedCellFactory(width).createCell().display());

		return sb.toString();
	}

	@Override
	public String levelfour() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory(width).createCell().display())
				.append(new SpacedCellFactory(width).createCell().display())
				.append(new PipedCellFactory().createCell().display());

		return sb.toString();
	}

	@Override
	public String levelfive() {
		StringBuilder sb = new StringBuilder()
				.append(new SpacedCellFactory(width).createCell().display())
				.append(new DashedCellFactory(width).createCell().display())
				.append(new SpacedCellFactory(width).createCell().display());

		return sb.toString();
	}

}
