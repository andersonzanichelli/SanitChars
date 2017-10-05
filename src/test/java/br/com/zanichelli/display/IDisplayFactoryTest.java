package br.com.zanichelli.display;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IDisplayFactoryTest {
	
	@Test
	public void zero() {
		IDisplayFactory display = new NumberDisplayFactory(1, 0);
		List<IDisplay> numbers = display.createDisplay();
		
		Assert.assertEquals(1, numbers.size());
		Assert.assertTrue(numbers.get(0) instanceof ZeroDisplay);
	}
	
	@Test
	public void one() {
		IDisplayFactory display = new NumberDisplayFactory(1, 1);
		List<IDisplay> numbers = display.createDisplay();
		
		Assert.assertEquals(1, numbers.size());
		Assert.assertTrue(numbers.get(0) instanceof OneDisplay);
	}
	
	@Test
	public void two() {
		IDisplayFactory display = new NumberDisplayFactory(1, 2);
		List<IDisplay> numbers = display.createDisplay();
		
		Assert.assertEquals(1, numbers.size());
		Assert.assertTrue(numbers.get(0) instanceof TwoDisplay);
	}
	
	@Test
	public void listNumbers() {
		IDisplayFactory display = new NumberDisplayFactory(1, 0, 1, 2);
		List<IDisplay> numbers = display.createDisplay();
		
		Assert.assertEquals(3, numbers.size());
		Assert.assertTrue(numbers.get(0) instanceof ZeroDisplay);
		Assert.assertTrue(numbers.get(1) instanceof OneDisplay);
		Assert.assertTrue(numbers.get(2) instanceof TwoDisplay);
	}

}
