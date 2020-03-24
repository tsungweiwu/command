package command;

/**
 * This is the load class that calls the instructions to load the document
 */
public class LoadCommand implements Command {
	private Document doc;

	/**
	 * Constructor initializing the class
	 * @param doc
	 */
	public LoadCommand(Document doc) {
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
		this.doc.load();
	}

}

