package command;

/**
 * @author juan-mariscal
 *
 */
public class LoadCommand implements Command {
	private Document doc;

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

