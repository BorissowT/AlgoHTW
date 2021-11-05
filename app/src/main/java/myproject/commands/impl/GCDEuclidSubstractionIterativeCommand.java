package myproject.commands.impl;

import myproject.commands.Algorithms.GCDEuclidSubtractionIt;
import myproject.commands.ICommand;
import myproject.console.IConsole;

public class GCDEuclidSubstractionIterativeCommand implements ICommand {


	final private IConsole console;
	
	public GCDEuclidSubstractionIterativeCommand(IConsole console) {
		super();
		this.console = console;
	}

	@Override
	public void execute() {
		int x = console.readInteger("Please, enter a number for x:");
		int y = console.readInteger("Please, enter a number for y:");
		int result = GCDEuclidSubtractionIt.get_gcd(x,y);
		console.write(String.format("gcd(%d, %d) = %d", x, y, result));

	}

	@Override
	public String toString() {

		return "GCD Euclid subtraction iterative.";

	}

}
