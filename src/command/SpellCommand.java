package command;

/**
 * @author juan-mariscal
 *
 */
public class SpellCommand implements Command {
	private Document doc;
	
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
