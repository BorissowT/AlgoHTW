package myproject.commands.impl;

import myproject.commands.Algorithms.GCDEuclidDivisionRestRec;
import myproject.commands.ICommand;
import myproject.console.IConsole;

public class GCDEuclidDivisionRestRecursivCommand implements ICommand {


	final private IConsole console;
	
	public GCDEuclidDivisionRestRecursivCommand(IConsole console) {
		super();
		this.console = console;
	}

	@Override
	public void execute() {
		int x = console.readInteger("Please, enter a number for x:");
		int y = console.readInteger("Please, enter a number for y:");
		
		int result = GCDEuclidDivisionRestRec.get_gcd(x,y);
		
		console.write(String.format("gcd(%d, %d) = %d", x, y, result));
	}

	@Override
	public String toString() {

		return "GCD Euclid division recursive.";

	}
}
