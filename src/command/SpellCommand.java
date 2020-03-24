package command;

/**
 * This is the spell class that calls the instructions to check for spelling errors in the document
 */
public class SpellCommand implements Command {
	private Document doc;
	
	/**
	 * Constructor initializing the class
	 * @param doc
	 */
	public SpellCommand(Document doc) {
		this.doc = doc;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.doc.toString();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.doc.spell();
	}

}
