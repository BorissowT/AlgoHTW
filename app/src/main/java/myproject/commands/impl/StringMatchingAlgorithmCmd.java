package myproject.commands.impl;

import myproject.commands.Algorithms.StringMatchingAlgorithm;
import myproject.commands.ICommand;
import myproject.console.IConsole;

public class StringMatchingAlgorithmCmd implements ICommand {

	final private IConsole console;

	public StringMatchingAlgorithmCmd(IConsole console) {
		super();
		this.console = console;
	}

	@Override
	public void execute() {
		String text = console.readString("Please, enter text for search:");
		String search = console.readString("Please, enter a word for search:");

		int match = StringMatchingAlgorithm.match(text, search);
		console.write("StringMatch() = "+ match);
	}

	@Override
	public String toString() {

		return "Search for a specific string in Linus Torvald's joke (String-MatchingAlgorithm).";

	}
}
