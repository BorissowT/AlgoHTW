package myproject.commands.impl;


import myproject.commands.ICommand;

public class ExitProgramCmd implements ICommand {

	@Override
	public void execute() {
		System.out.println("Exit program.");
		System.exit(0);		
	}

	@Override
	public String toString() {
		return "Exit program";
	}

	
}
