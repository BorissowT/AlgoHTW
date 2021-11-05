package myproject.commands;

import myproject.commands.impl.*;
import myproject.console.IConsole;

import java.util.LinkedList;

public class CommandFactory {

	final private IConsole console;

	public CommandFactory(IConsole console) {
		super();
		this.console = console;
	}
	public LinkedList<ICommand> returnsCommands() {
		LinkedList<ICommand> cmds = new LinkedList<ICommand>();

		cmds.add(new ExitProgramCmd());
		cmds.add(new GCDEuclidSubstractionRecursivCommand(console));
		cmds.add(new GCDEuclidSubstractionIterativeCommand(console));
		cmds.add(new GCDEuclidDivisionRestRecursivCommand(console));
		cmds.add(new GCDEuclidDivisionRestIterativeCommand(console));
		cmds.add(new StringMatchingAlgorithmCmd(console));
		cmds.add(new SieveEratosCommand(console));
		return cmds;
	}
}
