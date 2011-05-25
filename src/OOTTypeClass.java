/**
 * This is the basic type for classes defined in the intermediate language.
 */
public class OOTTypeClass implements OOTType {
	
	String name;
	
	public OOTTypeClass(String name){
		this.name=name;
	}

	public String toString() {
		return name;
	}
	
	public String genCode(String nameFile) {
		// TODO Auto-generated method stub
		return name;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		return name;
	}

}
