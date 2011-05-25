import java.io.File;



/**
 * This class accounts for assignments in the intermediate language.
 * Hence it is an OOTStatement.
 * @param T is the type of the variable, if known at compile time, otherwise put OOTType. 
 * The value must have an OOTType which extends this type.
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time.
 */
public class OOTAssign<T extends OOTType> implements OOTStatement {
	OOTVar<T> var;
	OOTExpr<? extends T> value;
	T type;
	
	/**
	 * @param type is the type of the variable that is being assigned. It extends T and hence OOTType. 
	 * @param var is a pointer to a previously declared variable
	 * @param value 
	 */
	public OOTAssign(T type, OOTVar<T> var, OOTExpr<? extends T> value){
		this.var=var;
		this.value=value;
		this.type=type;
	}

	public String genCodeState(String nameFile) {
		// TODO Auto-generated method stub
		return var.genCodeNode(nameFile)+"="+this.value.genCodeNode(nameFile)+";\n";
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return "return "+var.name;
		//return var.genCodeNode(nameFile)+"="+this.value.genCodeNode(nameFile)+";\n";
	}

}
