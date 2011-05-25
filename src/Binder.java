import java.util.List;


public interface Binder extends Node {
	
	  /**
	   * @return Returns a list of the variables which this nodes binds. 
	   */
	  public List<VarOccurrence> declaredVars();
	  
	  /**
	   * @return Returns a list of the types of the variables which this nodes binds. 
	   */
	  public List<Type> declaredTypes();
}
