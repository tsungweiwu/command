package command;

import java.util.HashMap;

public class InputHandler {
	private HashMap<String, Command> commands;
	private LoadCommand loadCommand;
	private SpellCommand spellCommand;
	private SaveCommand saveCommand;
	private PrintCommand printCommand;
	
	public InputHandler(Document document) {
		commands = new HashMap<>();
		loadCommand = new LoadCommand(document);
		spellCommand = new SpellCommand(document);
		saveCommand = new SaveCommand(document);
		printCommand = new PrintCommand(document);
		
		commands.put("load", loadCommand);
		commands.put("spell", spellCommand);
		commands.put("save", saveCommand);
		commands.put("print", printCommand);
	}
	
	public void inputEntered(String data) {
		if (commands.containsKey(data)) {
			Command command = commands.get(data);
			command.execute();
		} else {
			System.out.println("Sorry, we don't recognize that command");
		}
	}
}

