import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class OOTComp implements OOTExpr<OOTTypeInt> {


	private OOTNode left;
	private OOTNode right;
	private String signe;
	
	public OOTComp(OOTVar<OOTTypeInt> l, OOTVar<OOTTypeInt> r, String s) {
		this.left = l;
		this.right = r;
		this.signe = s;
	}
	
	public OOTComp(OOTNode left2, OOTNode right2, String s) {
		// TODO Auto-generated constructor stub
	}

	public OOTNode getLeft() {
		return left;
	}
	
	public OOTNode getRight() {
		return right;
	}
	
	public String getSigne() {
		return signe;
	}
	
	public void setLeft(OOTVar<OOTTypeInt> l) {
		left = l;
	}
	
	public void setRight(OOTVar<OOTTypeInt> r) {
		right = r;
	}
	
	public void genCode(File fich) {
		//ajoute dans le fichier le code de l'operation
		String oper = this.left.toString() + this.signe + this.right.toString();
		System.out.println(oper);
		FileWriter writer=null;
		try {
			writer = new FileWriter(fich.getAbsolutePath(),true);
			writer.write(oper);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String genCodeExpr(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}

	public String genCodeParam(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}

	public String genCodeState(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
