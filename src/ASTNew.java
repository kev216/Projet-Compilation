import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Generated By:JJTree: Do not edit this line. ASTNew.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTNew extends SimpleNode implements Binder {
	
	public ASTNew(int id) { super(id);}
	public ASTNew(Parser p, int id) { super(p, id);}

	public ASTTermVar getVar() 			 { return (ASTTermVar)jjtGetChild(0);}  
	public SimpleNode getFirstProcess()  { return (SimpleNode)jjtGetChild(1);}
	public SimpleNode getSecondProcess() { return (SimpleNode)jjtGetChild(2);}

	public List<VarOccurrence> declaredVars() { 
		VarOccurrence occ=new VarOccurrence(getVar().getName(),getVar());
		List<VarOccurrence> l = new ArrayList<VarOccurrence>();
		l.add(occ);
		return l;
	}

	public List<Type> declaredTypes() {
		List<Type> l = new ArrayList<Type>();
		ASTRef ty = new ASTRef(ParserTreeConstants.JJTTYPE);
		try {
			l.add(ty.type());
		} catch (TypeException e) {
			e.printStackTrace();
		}
		return l;
	}



	public Type type() throws TypeException {
		ASTTermVar x = this.getVar();
		Node t1 = this.getFirstProcess();
		ASTRef reftype = new ASTRef(ParserTreeConstants.JJTTYPE);
		if(!x.type().equals(reftype.type()))
			throw new TypeException("x type is not Ref");
		return t1.type();

	}

	public List<OOTStatement> code() throws TypeException {
		
		List<OOTStatement> listeRes = new ArrayList<OOTStatement>();
		String modifiers = "public";
		String nameClass = "Thread"+getVar().getLineColumn();

		//Creation des differents parametres pour creer un objet OOTClass
		List<OOTVar<? extends OOTType>> attributes = new ArrayList<OOTVar<?>>();
		List<OOTVar<? extends OOTType>> params = new ArrayList<OOTVar<?>>();
		List<OOTType> generictypes = new ArrayList<OOTType>();
		List<OOTMeth<? extends OOTType>> methods = new ArrayList<OOTMeth<?>>();
		List<OOTStatement> statements = new ArrayList<OOTStatement>();
		List<OOTExpr<?>> ListeExpr = new ArrayList<OOTExpr<?>>(); 

		//Types de reference
		ASTInt  inttype  = new ASTInt(Parser.JJTTYPE);
		ASTBool booltype = new ASTBool(Parser.JJTTYPE);
		ASTProc voidtype = new ASTProc(Parser.JJTTYPE);


		//Liste des variables libres
		List<VarOccurrence> free = this.findFreeBound(this.declaredVars());
		Iterator<VarOccurrence> itFree = free.iterator();
		int i=1;
		OOTVar<?> ootv=null;
		VarOccurrence variable = new VarOccurrence(getVar().getName(),getVar());
		OOTVar<?> param = null;
		OOTAssign<OOTType> initialise = null;
		ootv = new OOTVar<OOTTypeInt>("public",variable.name,new OOTTypeInt());
		param = new OOTVar<OOTTypeInt>("public",variable.name+String.valueOf(i),new OOTTypeInt());
		initialise = new OOTAssign<OOTType>(new OOTTypeNone(),(OOTVar<OOTType>) ootv,new OOTVarCall<OOTTypeInt>(new OOTVar<OOTTypeInt>("public",variable.name+String.valueOf(i),new OOTTypeInt())));
		OOTVar<OOTType> liste = new OOTVar<OOTType>("public","l",new OOTTypeClass("ArrayBlockingQueue"));
		OOTClass blockQueue = new OOTClass("public","ArrayBlockingQueue","",new ArrayList<OOTType>(),new ArrayList<OOTVar<?>>(),new ArrayList<OOTMeth<?>>());
		OOTAssign<OOTType> initListe = new OOTAssign<OOTType>(new OOTTypeNone(),(OOTVar<OOTType>) liste,new OOTClassNew(blockQueue,new ArrayList<OOTExpr<? extends OOTType>>()));
		attributes.add(ootv);

		params.add(param);
		statements.add(initialise);
		statements.add(initListe);
		while(itFree.hasNext()) {
			VarOccurrence var = itFree.next();
			if(getVar().type().equals(inttype.type())) {	  
				ootv = new OOTVar<OOTTypeInt>("public",var.name,new OOTTypeInt());
				param = new OOTVar<OOTTypeInt>("public",var.name+String.valueOf(i),new OOTTypeInt());
				initialise = new OOTAssign<OOTType>(new OOTTypeNone(),(OOTVar<OOTType>) ootv,new OOTVarCall<OOTTypeInt>(new OOTVar<OOTTypeInt>("public",var.name+String.valueOf(i),new OOTTypeInt())));
				i++;
				
			}  else if(var.position.type().equals(voidtype.type())) {
				String lc = jjtGetParent().toString(); 
				ASTTermVar f = (ASTTermVar)jjtGetParent().jjtGetChild(1);
				lc += f.getLineColumn();
				ootv = new OOTVar<OOTTypeClass>("public",var.name,new OOTTypeClass(lc));
				param = new OOTVar<OOTTypeClass>("public",var.name+String.valueOf(i),new OOTTypeClass(lc));
				initialise = new OOTAssign<OOTType>(new OOTTypeNone(),(OOTVar<OOTType>) ootv,new OOTVarCall<OOTTypeClass>(new OOTVar<OOTTypeClass>("public",var.name+String.valueOf(i),new OOTTypeClass(lc))));
				attributes.add(ootv);	
				params.add(param);
				statements.add(initialise);
				i++;
			}	
			attributes.add(ootv);	
			params.add(param);
			statements.add(initialise);
		}
		attributes.add(liste);
		
		OOTMeth<OOTType> construct = new OOTMeth<OOTType>("public",new OOTTypeNone(),nameClass,params,statements);
		methods.add(construct);
		List<OOTVar<? extends OOTType>> listeAppelante = new ArrayList<OOTVar<? extends OOTType>>();
		listeAppelante.add(liste);
		
		statements = new ArrayList<OOTStatement>();
		statements.addAll(getFirstProcess().code());
		OOTMeth<OOTType> run = new OOTMeth<OOTType>("public",new OOTTypeVoid(),"run",new ArrayList<OOTVar<? extends OOTType>>(),statements); 
		methods.add(run);
		
		OOTClass classe = new OOTClass(modifiers,nameClass,"thread",generictypes,attributes,methods);
		classe.genCodeNode(nameClass+".java");

		Iterator<OOTVar<?>> itB = attributes.iterator();
		while(itB.hasNext()) {
			OOTVar<OOTTypeClass> var =  (OOTVar<OOTTypeClass>) itB.next();
			OOTVarCall<OOTTypeClass> vc = new OOTVarCall<OOTTypeClass>(var);
			ListeExpr.add(vc);
		}
		ListeExpr.remove(ListeExpr.size()-1);

		/* Initialisation de la liste de statement � renvoyer */

		OOTVar<OOTTypeClass> var =  new OOTVar<OOTTypeClass>("public",getVar().getName(),new OOTTypeClass(nameClass));
		OOTStatement dec = new OOTVarCall<OOTTypeClass>(var);
		listeRes.add(dec);
		OOTAssign<OOTTypeClass> as = new OOTAssign<OOTTypeClass>(new OOTTypeClass(nameClass),var,new OOTClassNew(classe,ListeExpr));
		listeRes.add(as);
		List<OOTVar<?>> listeA = new ArrayList<OOTVar<?>>();
		listeAppelante.add(var);
		OOTMethConnu start = new OOTMethConnu(listeA,"start","");
		listeRes.add(start);
		listeRes.addAll(getSecondProcess().code());
		return listeRes;
	}





}
/* JavaCC - OriginalChecksum=1a55b6f13a59efbb92f5ae9249c55ee0 (do not edit this line) */
