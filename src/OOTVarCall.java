
/**
 * This class captures variable content invocation.
 * Hence is is an OOTExpr.
 * This has to be distinguished from OOTVar because later it does not compile in the same way.
 * @param T is the type of the variable, if known at compile time, otherwise put OOTType. 
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time.
 */
public class OOTVarCall<T extends OOTType> implements OOTExpr<T> {

	OOTVar<T> var;
	
	/**
	 * The type of the return value is T
	 * @param method is a pointer to the previous declaration of the method to be invoked.
	 * @param params 
	 */
	public OOTVarCall(OOTVar<T> var){
		this.var=var;
	}
	
	public String genCodeParam(String nameFile) {
	 	return this.var.type.genCodeNode(nameFile)+" "+var.name;
	}

	public String genCodeState(String nameFile) {
		return var.genCodeDec(nameFile);
	}

	public String genCodeExpr(String nameFile) {
		return var.name;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return var.genCodeNode(nameFile);
	}
}
