import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * This class captures the "new" of the intermediate language, 
 * i.e object instantiation from a class definition
 * Hence is is an OOTExpr.
 * @param T is the return type
 * In generic OO languages each object instantiations may generate new types, hence this is an OOType.
 */
public class OOTClassNew implements OOTExpr<OOTTypeClass> {

	OOTClass mclass;
	List<OOTExpr<? extends OOTType>> params;
	//OOTClassFree classfree;

	
	/**
	 * @param method is a pointer to the previous declaration of the class to be instantiated.
	 * @param params are the constructor's parameters
	 */
	public OOTClassNew(OOTClass mclass, List<OOTExpr<? extends OOTType>> params){
		this.mclass=mclass;
		this.params=params;
	}


	public String genCodeExpr(String nameFile) {
		String resultat = "";
		Iterator<OOTExpr<?>> it = params.iterator();
		int lon = params.size();
		while(it.hasNext()) {
			resultat += it.next().genCodeExpr(nameFile);
			if(lon > 1)
				resultat+=",";
			lon--;
		}
		return "new "+mclass.name+"("+resultat+")";
	}

	public String genCodeParam(String nameFile) {
		String resultat = "";
		Iterator<OOTExpr<?>> it = params.iterator();
		int lon = params.size();
		while(it.hasNext()) {
			resultat += it.next().genCodeExpr(nameFile);
			if(lon > 1)
				resultat+=",";
			lon--;
		}
		return "new "+mclass.name+"("+resultat+")";
	}


	public String genCodeState(String nameFile) {
		String resultat = "";
		Iterator<OOTExpr<?>> it = params.iterator();
		int lon = params.size();
		while(it.hasNext()) {
			resultat += it.next().genCodeExpr(nameFile);
			if(lon > 1)
				resultat+=",";
			lon--;
		}
		return "return new "+mclass.name+"("+resultat+");";
	}


	public String genCodeNode(String nameFile) {
		String resultat = "";
		Iterator<OOTExpr<?>> it = params.iterator();
		int lon = params.size();
		while(it.hasNext()) {
			resultat += it.next().genCodeExpr(nameFile);
			if(lon > 1)
				resultat+=",";
			lon--;
		}
		return "new "+mclass.name+"("+resultat+")";
	}

}
