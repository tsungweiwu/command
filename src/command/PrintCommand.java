package command;

/**
 * This is the print class that calls the instructions to print the document
 */
public class PrintCommand implements Command {
	private Document doc;
	
	/**
	 * Constructor initializing the class
	 * @param doc
	 */
	public PrintCommand(Document doc) {
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
		this.doc.print();
	}

}
