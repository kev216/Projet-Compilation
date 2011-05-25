/**
 * This interface accounts for all statements of the intermediate language.
 */
public interface OOTStatement extends OOTNode {
	
	public String genCodeState(String nameFile);
	public String toString();

}
