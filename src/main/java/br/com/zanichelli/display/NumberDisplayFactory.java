package br.com.zanichelli.display;

import static java.util.Arrays.asList;

import java.util.List;

import com.google.common.collect.Lists;

public class NumberDisplayFactory implements IDisplayFactory {

	private List<Integer> numbers;
	private int width;
	private int height;

	public NumberDisplayFactory(int width, int height, Integer... numbers) {
		this.width = width;
		this.height = height;
		this.numbers = asList(numbers);
	}

	@Override
	public List<IDisplay> createDisplay() {
		
		return searchDisplays();
	}

	private List<IDisplay> searchDisplays() {
		List<IDisplay> displays = Lists.newArrayList();
		
		for (Integer number : numbers) {
			
			switch (number) {
			
			case 0:
				displays.add(new ZeroDisplay(width, height));
				break;
			
			case 1:
				displays.add(new OneDisplay(width, height));
				break;
				
			case 2:
				displays.add(new TwoDisplay(width, height));
				break;
				
			case 3:
				displays.add(new ThreeDisplay(width, height));
				break;
				
			case 4:
				displays.add(new FourDisplay(width, height));
				break;
				
			case 5:
				displays.add(new FiveDisplay(width, height));
				break;

			default:
				break;
			}
		}
		
		return displays;
	}

}
