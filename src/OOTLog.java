
public class OOTLog implements OOTExpr<OOTType> {

	private OOTNode left;
	private OOTNode right;
	private String signe;
	
	public OOTLog(OOTNode l, OOTNode r, String s) {
		this.left = l;
		this.right = r;
		this.signe = s;
	}
	
	public OOTNode getLeft() {
		return left;
	}
	
	public OOTNode getRight() {
		return right;
	}
	
	public String getSigne() {
		return ""+signe;
	}
	
	public void setLeft(OOTNode l) {
		left = l;
	}
	
	public void setRight(OOTNode r) {
		right = r;
	}
	
	public OOTStatement state(Node n) {
		OOTExpr<OOTType> exp = new OOTLog(this.left,this.right,this.signe);
		OOTStatement s = exp;
		return s;
	}

	public String genCodeExpr(String nameFile) {
		//ajoute dans le fichier le code de l'operation
		String log = this.left.genCodeNode(nameFile) + this.signe + this.right.genCodeNode(nameFile); 
		return log;
	}

	public String genCodeParam(String nameFile) {
		String log = this.left.genCodeNode(nameFile) + this.signe + this.right.genCodeNode(nameFile); 

		return log;
	}

	public String genCodeState(String nameFile) {
		String log = "return "+this.left.genCodeNode(nameFile) + this.signe + this.right.genCodeNode(nameFile)+";"; 
		return log;
	}

	public String genCodeNode(String nameFile) {
		//ajoute dans le fichier le code de l'operation
		String oper = this.left.genCodeNode(nameFile) + this.signe + this.right.genCodeNode(nameFile); 
		return oper;
	}
}
