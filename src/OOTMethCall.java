import java.util.Iterator;
import java.util.List;

/**
 * This class captures function invocation.
 * Hence is is an OOTExpr.
 * @param T is the return type, , if known at compile time, otherwise put OOTType. 
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time.
 */
public class OOTMethCall<T extends OOTType> implements OOTExpr<T> {

	List<OOTVar<? extends OOTType>> appelante;
	OOTMeth<T> method;
	List<OOTExpr<? extends OOTType>> params;
	
	/**
	 * The type of the return value is T
	 * @param method is a pointer to the previous declaration of the method to be invoked.
	 * @param params 
	 */
	public OOTMethCall(List<OOTVar<? extends OOTType>> appel, OOTMeth<T> method, List<OOTExpr<? extends OOTType>> params){
		this.appelante = appel;
		this.method=method;
		this.params=params;
	}

	public String genCodeExpr(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}

	public String genCodeParam(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}

	public String genCodeState(String nameFile) {
		// TODO Auto-generated method stub
		String header = "return ";
		Iterator<OOTVar<? extends OOTType>> itt = this.appelante.iterator();
		while(itt.hasNext())
			header+=itt.next().genCodeNode(nameFile)+".";
		header+=this.method.name+"(";
		Iterator<OOTExpr<? extends OOTType>> it = this.params.iterator();
		while(it.hasNext())
			header += it.next().genCodeNode(nameFile);
		header+=");\n";
		return header;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}
}
