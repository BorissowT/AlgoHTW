package myproject.commands.impl;

import myproject.commands.Algorithms.SieveEratosthenes;
import myproject.commands.ICommand;
import myproject.console.IConsole;

public class SieveEratosCommand implements ICommand {

	final private IConsole console;

	public SieveEratosCommand(IConsole console) {
		super();
		this.console = console;
	}

	@Override
	public void execute() {
		int x = console.readInteger("Please, enter a number for x:");

		int[] primes = SieveEratosthenes.get_prime(x);

		for (int prime:
			 primes) {
			console.write("prime " + Integer.toString(prime));
		}
	}
	@Override
	public String toString() {

		return "Sieve of Eratosthenes.";

	}
}
