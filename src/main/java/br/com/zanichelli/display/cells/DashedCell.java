package br.com.zanichelli.display.cells;

public class DashedCell implements ICell {

	private int width;

	public DashedCell(int width) {
		this.width = width;
	}

	@Override
	public String display() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < width; i++)
			sb.append("-");
		
		return sb.toString();
	}

}
