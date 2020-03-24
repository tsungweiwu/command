package command;

/**
 * This class is to define the document that the user inputs in order to be processed and defines each command and its functions
 */
public class Document {
	private String name;
	
	public Document(String name) {
		this.name = name;
	}
	
	public void load() {
		System.out.println("document " + name + " is being loaded into view");
	}
	
	public void spell() {
		System.out.println("document " + name + " is being checked for spelling errors");
	}
	
	public void save() {
		System.out.println("document " + name + " is being saved...");
	}
	
	public void print() {
		System.out.println("document " + name + " is printing...");
	}
}
