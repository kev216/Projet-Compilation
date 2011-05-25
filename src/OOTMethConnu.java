import java.util.Iterator;
import java.util.List;


public class OOTMethConnu implements OOTStatement {
	
	List<OOTVar <? extends OOTType>> listeAppelante;
	String nomMeth;
	String params;
	
	public OOTMethConnu(List<OOTVar <? extends OOTType>> listeAppelante, String nomMeth, String params) {
		this.listeAppelante = listeAppelante;
		this.nomMeth = nomMeth;
		this.params = params;
	}
	
	public String genCodeState(String nameFile) {
		String res = "";
		Iterator<OOTVar<? extends OOTType>> it = listeAppelante.iterator();
		if(nomMeth != "") {
			while(it.hasNext())
				res += it.next().genCodeNode(nameFile) + ".";
			res += nomMeth + "("+params+");";
		} else {
			res+= "return "+listeAppelante.get(0).genCodeNode(nameFile)+";";
		}
		return res;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return this.genCodeState(nameFile);
	}

}
