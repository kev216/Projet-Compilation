import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * This captures classes in the intermediate language.
 * For each object member of OOTClass the compiler will
 * have to generate a separate file containing the code of the class
 * in the target language.
 */
public class OOTClass implements OOTNode, OOTStatement {
	
	String modifiers;
	String name;
	String extend;
	List<? extends OOTType> generictypes;
	List<OOTVar<? extends OOTType>> attributes;
	List<OOTMeth<? extends OOTType>> methods;
	
	public OOTClass(String modifiers, String name, String ext, List<? extends OOTType> generictypes,List<OOTVar<? extends OOTType>> attributes, List<OOTMeth<? extends OOTType>> methods){
		this.modifiers=modifiers;
		this.name=name;
		this.extend = ext;
		this.generictypes=generictypes;
		this.attributes=attributes;
		this.methods=methods;
	}

	public String genCodeNode(String nameFile) {
		// TODO Auto-generated method stub
		String header = "public class "+this.name;
		if(extend != "") {
			header+=" extends "+extend;
			//System.out.println(header);
		}
		header +=" {\n";
		String declaration = "";
		String meth="";
		if(attributes.size() > 0) {
			Iterator<OOTVar<? extends OOTType>> itA = attributes.iterator();
			while(itA.hasNext()) {
				//System.out.println("Attributes : "+itA.next().name);
				declaration += itA.next().genCodeAttributes(nameFile)+"\n";
				//System.out.println(header);
			}
		}
		Iterator<OOTMeth<? extends OOTType>> itM = this.methods.iterator();
		while(itM.hasNext()) {
			meth+=itM.next().genCodeState(nameFile)+"\n";
			//System.out.println(meth);
		}
		String fin ="}";
		String classe = header+declaration+meth+fin;
		FileWriter fw;
		try {
			fw = new FileWriter(nameFile, false);
			BufferedWriter output = new BufferedWriter(fw);
			
			//on marque dans le fichier ou plutot dans le BufferedWriter qui sert comme un tampon(stream)
			output.write(classe);
			//on peut utiliser plusieurs fois methode write
			
			output.flush();
			//ensuite flush envoie dans le fichier, ne pas oublier cette methode pour le BufferedWriter
			
			output.close();
			//et on le ferme
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return classe;
	}

	public String genCodeState(String nameFile) {
		// TODO Auto-generated method stub
		return null;
	}


}
