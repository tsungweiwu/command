package command;

import java.util.HashMap;

/**
 * This class handles the different commands/instructions to be carried out
 */
public class InputHandler {
	private HashMap<String, Command> commands;
	private LoadCommand loadCommand;
	private SpellCommand spellCommand;
	private SaveCommand saveCommand;
	private PrintCommand printCommand;
	
	/**
	 * This method passes the document name into the separate commands to be instantiated in a hash map
	 * @param document
	 */
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
	
	/**
	 * This method checks for the command being called to see if it matches any from the hash map and executes the command accordingly, else give an error
	 * @param data
	 */
	public void inputEntered(String data) {
		if (commands.containsKey(data)) {
			Command command = commands.get(data);
			command.execute();
		} else {
			System.out.println("Sorry, we don't recognize that command");
		}
	}
}

