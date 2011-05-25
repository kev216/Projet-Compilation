


/**
 * This class captures a variable declaration in the intermediate language.
 * Hence it is an OOTDec.
 * But because declarations are usually OK statements in OO Languages it is also an OOStatement
 * @param T is the type of the declared variable, if known at compile time, otherwise put OOTType. 
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time.
 */
public class OOTVar<T extends OOTType> implements OOTDec<T>, OOTStatement {

	String modifiers;
	T type;
	String name;

	
	/**
	 * The type of the variable is T.
	 * @param modifiers codes for the visibility of the variable and so on
	 * @param name codes for the name of the variable
	 */
	OOTVar(String modifiers, String name,T type) {
		this.modifiers = modifiers;
		this.name=name;
		this.type = type;
	}
	
	public String genCodeParam(String nameFile) {
		return this.type.genCodeNode(nameFile)+" "+this.name;
	}
	
	public String genCodeAttributes(String nameFile) {
		return this.type.genCodeNode(nameFile)+" "+this.name+";";
	}

	public String genCodeDec(String nameFile) {
		// TODO Auto-generated method stub
		return this.type.genCodeNode(nameFile)+" "+this.name+";";
	}

	public String genCodeState(String nameFile) {
		if(this.type.genCodeNode(nameFile) == "" || this.type instanceof OOTTypeNone || this.type instanceof OOTTypeVoid)
			return this.name+".val();\n";
		return "return "+this.name+".val();\n";
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return this.name;
	}

	
}
