package br.com.zanichelli.display;

import static java.util.Arrays.asList;

import java.util.List;

import com.google.common.collect.Lists;

public class NumberDisplayFactory implements IDisplayFactory {

	private List<Integer> numbers;
	private int size;

	public NumberDisplayFactory(int size, Integer... numbers) {
		this.size = size;
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
				displays.add(new ZeroDisplay(size));
				break;
			
			case 1:
				displays.add(new OneDisplay(size));
				break;
				
			case 2:
				displays.add(new TwoDisplay(size));
				break;
				
			case 3:
				displays.add(new ThreeDisplay(size));
				break;

			default:
				break;
			}
		}
		
		return displays;
	}

}
