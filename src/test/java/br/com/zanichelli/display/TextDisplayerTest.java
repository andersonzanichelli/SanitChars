package br.com.zanichelli.display;

import org.junit.Test;

public class TextDisplayerTest {

	@Test
	public void test() {
		IDisplayFactory display = new NumberDisplayFactory(1, 0, 1, 2, 3, 4);
		IDisplayer displayer = new TextDisplayer(display.createDisplay());
		
		displayer.show();
	}

}
