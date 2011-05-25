import java.io.File;


/**
 * This class captures all the expressions of the intermediate language
 * which we have not bothered to represent in the Abstract Syntax Tree.
 * Its code will compile in the target language just as it is.
 * It is an OOTExpr.
 * @param T is the type of this expression, if known at compile time, otherwise put OOTType. 
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time. 
 */
public class OOTConstant<T extends OOTType> implements OOTExpr<T> {

	String code;
	T type;

	/**
	 * The type of the return value is T
	 * @param type
	 * @param code 
	 */
	public OOTConstant(T type, String code){
		this.type=type;
		this.code=code;
	}
	


	public String genCode(String nameFile) {
		// TODO Auto-generated method stub
		return code;
	}

	public String genCodeExpr(String nameFile) {
		// TODO Auto-generated method stub
		return code;
	}

	public String genCodeParam(String nameFile) {
		// TODO Auto-generated method stub
		return "return "+code+";";
	}

	public String genCodeState(String nameFile) {
		// TODO Auto-generated method stub
		return this.code;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return code;
	}
}
