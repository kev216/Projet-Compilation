import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * This captures the if statements of the intermediate language.
 * Hence it is an OOTStatement.
 * Notice the type checking achieved through generics.
 */
public class OOTIf implements OOTStatement {
	
	OOTExpr<OOTType> condition;
	List<OOTStatement> statesVrai;
	List<OOTStatement> statesFaux;
	
	/**
	 * @param condition 
	 * @param statements
	 */
	public OOTIf(OOTExpr<OOTType> condition, List<OOTStatement> statesVrai,List<OOTStatement> statesFaux){
		this.condition = condition;
		this.statesVrai = statesVrai;
		this.statesFaux = statesFaux;
	}

	public String genCodeState(String nameFile) {
		String res = "if ( ";
		res += this.condition.genCodeExpr(nameFile);
		res += " ) {\n";
		Iterator<OOTStatement> itVrai = statesVrai.iterator();
		while(itVrai.hasNext())
			res += itVrai.next().genCodeState(nameFile);
		
		res += "} else {\n";
		Iterator<OOTStatement> itFaux = statesFaux.iterator();
		while(itFaux.hasNext())
			res += itFaux.next().genCodeState(nameFile);
		res += "}";
		return res;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}



}
