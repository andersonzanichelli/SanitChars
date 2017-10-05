package br.com.zanichelli.display;

import java.util.List;

public class TextDisplayer implements IDisplayer {

	private List<IDisplay> display;

	public TextDisplayer(List<IDisplay> display) {
		this.display = display;
	}
	
	public void show() {
		for (IDisplay d : display)
			System.out.print(d.levelOne());
		
		System.out.println();
		
		for (IDisplay d : display)
			System.out.print(d.leveltwo());
		
		System.out.println();
		
		for (IDisplay d : display)
			System.out.print(d.levelthree());
		
		System.out.println();
		
		for (IDisplay d : display)
			System.out.print(d.levelfour());
		
		System.out.println();
		
		for (IDisplay d : display)
			System.out.print(d.levelfive());
		
		System.out.println();
	}
}
