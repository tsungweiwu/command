package command;

/**
 * This interface instantiates the functions necessary for the commands to take place
 */
public interface Command {
	public String getName();
	public void execute();
}
