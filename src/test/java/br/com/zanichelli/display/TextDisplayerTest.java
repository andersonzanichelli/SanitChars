package br.com.zanichelli.display;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TextDisplayerTest {
	
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}

	@Test
	public void test0() {
		IDisplayFactory display = new NumberDisplayFactory(1, 1, 0);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
		
		Assert.assertEquals(
				" - \n" + 
				"| |\n" + 
				"| |\n" + 
				"| |\n" + 
				" - \n" , outContent.toString());
	}
	
	@Test
	public void test01() {
		IDisplayFactory display = new NumberDisplayFactory(1, 1, 0, 1);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
		
		Assert.assertEquals(
				" -    \n" + 
				"| | | \n" + 
				"| | | \n" + 
				"| | | \n" + 
				" -    \n" , outContent.toString());
	}
	
	@Test
	public void test012() {
		IDisplayFactory display = new NumberDisplayFactory(1, 1, 0, 1, 2);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
		
		Assert.assertEquals(
				" -     - \n" + 
				"| | |   |\n" + 
				"| | |  - \n" + 
				"| | | |  \n" + 
				" -     - \n" , outContent.toString());
	}
	
	@Test
	public void test0123() {
		IDisplayFactory display = new NumberDisplayFactory(1, 1, 0, 1, 2, 3);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
		
		Assert.assertEquals(
				" -     -  - \n" + 
				"| | |   |  |\n" + 
				"| | |  -  - \n" + 
				"| | | |    |\n" + 
				" -     -  - \n" , outContent.toString());
	}
	
	@Test
	public void test01234() {
		IDisplayFactory display = new NumberDisplayFactory(1, 1, 0, 1, 2, 3, 4);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
		
		Assert.assertEquals(
				" -     -  -    \n" + 
				"| | |   |  || |\n" + 
				"| | |  -  -  -|\n" + 
				"| | | |    |  |\n" + 
				" -     -  -    \n" , outContent.toString());
	}
	
	@Test
	public void test012345() {
		IDisplayFactory display = new NumberDisplayFactory(1, 1, 0, 1, 2, 3, 4, 5);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
		
		Assert.assertEquals(
				" -     -  -     - \n" + 
				"| | |   |  || ||  \n" + 
				"| | |  -  -  -| - \n" + 
				"| | | |    |  |  |\n" + 
				" -     -  -     - \n" , outContent.toString());
	}
	
	@Test
	public void test0Width2() {
		IDisplayFactory display = new NumberDisplayFactory(3, 1, 0);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
		
		Assert.assertEquals(
				" --- \n" + 
				"|   |\n" + 
				"|   |\n" + 
				"|   |\n" + 
				" --- \n" , outContent.toString());
	}
	
	@Test
	public void test0Height2() {
		IDisplayFactory display = new NumberDisplayFactory(5, 2, 0);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
		
		Assert.assertEquals(
				" ----- \n" + 
				"|     |\n" + 
				"|     |\n" + 
				"|     |\n" + 
//				"|     |\n" + 
//				"|     |\n" + 
//				"|     |\n" + 
				" ----- \n" , outContent.toString());
	}
}
