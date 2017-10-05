package br.com.zanichelli.display.cells;

import org.junit.Assert;
import org.junit.Test;

public class ICellFactoryTest {

	@Test
	public void createDashCell() {
		ICellFactory cellFactory = new DashedCellFactory();
		ICell cell = cellFactory.createCell();
		
		Assert.assertEquals("-", cell.display());
	}

	@Test
	public void createPipeCell() {
		ICellFactory pipeFactory = new PipedCellFactory();
		ICell cell = pipeFactory.createCell();
		
		Assert.assertEquals("|", cell.display());
	}
	
	@Test
	public void createSpaceCell() {
		ICellFactory spaceFactory = new SpacedCellFactory();
		ICell cell = spaceFactory.createCell();
		
		Assert.assertEquals(" ", cell.display());
	}
}
