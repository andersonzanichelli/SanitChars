package br.com.zanichelli.display.cells;

import org.junit.Assert;
import org.junit.Test;

public class ICellFactoryTest {

	@Test
	public void createDashCell() {
		ICellFactory cellFactory = new DashedCellFactory(1);
		ICell cell = cellFactory.createCell();
		
		Assert.assertEquals("-", cell.display());
	}
	
	@Test
	public void createDashCellWidth2() {
		ICellFactory cellFactory = new DashedCellFactory(2);
		ICell cell = cellFactory.createCell();
		
		Assert.assertEquals("--", cell.display());
	}
	
	@Test
	public void createDashCellWidth4() {
		ICellFactory cellFactory = new DashedCellFactory(4);
		ICell cell = cellFactory.createCell();
		
		Assert.assertEquals("----", cell.display());
	}

	@Test
	public void createPipeCell() {
		ICellFactory pipeFactory = new PipedCellFactory();
		ICell cell = pipeFactory.createCell();
		
		Assert.assertEquals("|", cell.display());
	}
	
	@Test
	public void createSpaceCell() {
		ICellFactory spaceFactory = new SpacedCellFactory(1);
		ICell cell = spaceFactory.createCell();
		
		Assert.assertEquals(" ", cell.display());
	}
}
