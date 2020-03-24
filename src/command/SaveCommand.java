/**
 * 
 */
package command;

/**
 * This is the save class that calls the instructions to save the document
 */
public class SaveCommand implements Command {
	private Document doc;
	
	/**
	 * Constructor initializing the class
	 * @param doc
	 */
	public SaveCommand(Document doc) {
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
		this.doc.save();
	}

}
