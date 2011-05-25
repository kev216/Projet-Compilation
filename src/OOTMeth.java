
import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * This class accounts for method declarations in the intermediate language.
 * Hence it is an OOTDec.
 * @param T is the return type, if known at compile time, otherwise put OOTType. 
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time.
 */
public class OOTMeth<T extends OOTType> implements OOTDec<T> {

	String modifiers;
	T type;
	String name;
	List<OOTVar<? extends OOTType>> paramdecs;
	List<OOTStatement> statements;

	/**
	 * @param modifiers stores the visibility etc.
	 * @param type stores the return type of the function, i.e. something which extends T and hence OOTType.
	 * @param name is the name of the declared method.
	 * @param paramdecs is a list of variable declarations corresponding to the parameters of the method.
	 * @param statements holds the body.
	 */
	public OOTMeth(String modifiers, T type, String name, List<OOTVar<? extends OOTType>> paramdecs, List<OOTStatement> statements) {
		this.modifiers = modifiers;
		this.type = type;
		this.name=name;
		this.paramdecs=paramdecs;
		this.statements=statements;
	}

	public String genCodeDec(String nameFile) {
		String header = modifiers+" "+type.toString()+" "+name+"(";
		String params="";
		Iterator<OOTVar<? extends OOTType>> it = this.paramdecs.iterator();
		while(it.hasNext()) {
			params += it.next().genCodeParam(nameFile);
			if(it.hasNext())
				params+=",";
		}
		header += params+");";
		return header;
	}

	public String genCodeState(String nameFile) {
		String header = modifiers+" "+type.genCodeNode(nameFile)+" "+name+"(";
		String params="";
		Iterator<OOTVar<? extends OOTType>> it = this.paramdecs.iterator();
		while(it.hasNext()) {
			params += it.next().genCodeParam(nameFile);
			if(it.hasNext())
				params+=",";
		}
		header+=params+") {\n";
		String states="";
		Iterator<OOTStatement> itt = this.statements.iterator();
		while(itt.hasNext()) {
			OOTStatement state = itt.next();
			states+=state.genCodeState(nameFile)+"\n";	
		}
		header+=states+"\n}\n";
		return header;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}

}
