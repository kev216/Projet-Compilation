/**
 * This class stores occurrences of variables by their name and place of occurrence in the AST
 */
public class VarOccurrence {
	
	protected final String name; 
	protected final ASTTermVar position;
	
	/**
	 * @param name is the name of the variable
	 * @param node is where it occurred in the tree
	 */
	public VarOccurrence(String name,ASTTermVar position){
		this.name=name;
		this.position=position;
	}

	public String toString(){
		return "VarOcc "+name+" at "+position.getLineColumn();
	}
	
	public boolean equals(Object obj){
		if (obj instanceof VarOccurrence) {
			return ((VarOccurrence) obj).name.equals(name);
			}
		else return false;
	}
}
