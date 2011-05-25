import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Generated By:JJTree: Do not edit this line. ASTFun.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTFun extends SimpleNode implements Binder {
	public ASTFun(int id) {
		super(id);
	}

	public ASTFun(Parser p, int id) {
		super(p, id);
	}


	/* MY CUSTOMIZATION OF ASTFun */

	public Type getArgType() {return (Type) jjtGetChild(0);} 
	public ASTTermVar getArg() {return (ASTTermVar) jjtGetChild(1);}
	public Node getBody() {return (Node) jjtGetChild(2);}


	public List<VarOccurrence> declaredVars() {
		VarOccurrence o=new VarOccurrence(getArg().getName(),getArg());
		List<VarOccurrence> l=new ArrayList<VarOccurrence>();
		l.add(o);
		return l;
		//Here there was a variable declaration, i.e. fun is a binder
		//So declaredVar returns the name of the declared variable
		//And a pointer to its location in the AST.
	}

	public List<Type> declaredTypes() {
		List<Type> l=new ArrayList<Type>();
		l.add(getArgType());
		return l;
		//Here there was a variable declaration, i.e. fun is a binder
		//So declaredTypes returns the type of the declared variable
		//And a pointer to its location in the AST.
	}

	public Type type() throws TypeException{
		Type bodytype= getBody().type();
		//Checking the body type may raise exceptions
		ASTArrowType arr= new ASTArrowType(ParserTreeConstants.JJTARROWTYPE);
		arr.jjtAddChild(getArgType(), 0);
		arr.jjtAddChild(bodytype, 1);
		return arr;
	}

	public List<OOTStatement> code() throws TypeException {
		List<OOTStatement> listeRes = new ArrayList<OOTStatement>();
		String modifiers = "public";
		String name = "Fun"+getArg().getLineColumn();

		//Creation des differents parametres pour creer un objet OOTClass
		List<OOTVar<? extends OOTType>> attributes = new ArrayList<OOTVar<?>>();
		List<OOTVar<? extends OOTType>> params = new ArrayList<OOTVar<?>>();
		List<OOTType> generictypes = new ArrayList<OOTType>();
		List<OOTMeth<? extends OOTType>> methods = new ArrayList<OOTMeth<?>>();
		List<OOTStatement> statements = new ArrayList<OOTStatement>();

		List<OOTExpr<?>> ListeExpr = new ArrayList<OOTExpr<?>>(); 

		//Types de reference
		ASTInt inttype = new ASTInt(Parser.JJTTYPE);
		ASTBool booltype = new ASTBool(Parser.JJTTYPE);

		//Liste des variables libres
		List<VarOccurrence> free = this.findFreeBound(this.declaredVars());
		Iterator<VarOccurrence> itFree = free.iterator();
		int i=1;
		while(itFree.hasNext()) {
			OOTVar<?> ootv=null;
			VarOccurrence var = itFree.next();
			OOTVar<?> param = null;
			OOTAssign<OOTType> initialise = null;
			//System.out.println("Var : "+var.name);
			if(getArg().type().equals(inttype.type())) {	  
				ootv = new OOTVar<OOTTypeInt>("public",var.name,new OOTTypeInt());
				param = new OOTVar<OOTTypeInt>("public",var.name+String.valueOf(i),new OOTTypeInt());
				initialise = new OOTAssign<OOTType>(new OOTTypeNone(),(OOTVar<OOTType>) ootv,new OOTVarCall<OOTTypeInt>(new OOTVar<OOTTypeInt>("public",var.name+String.valueOf(i),new OOTTypeInt())));
				i++;
			}	else if (getArg().type().equals(booltype.type())) {
				ootv = new OOTVar<OOTTypeBool>("public",var.name,new OOTTypeBool());
				param = new OOTVar<OOTTypeBool>("public",var.name+String.valueOf(i),new OOTTypeBool());
				initialise = new OOTAssign<OOTType>(new OOTTypeNone(),(OOTVar<OOTType>) ootv,new OOTVarCall<OOTTypeBool>(new OOTVar<OOTTypeBool>("public",var.name+String.valueOf(i),new OOTTypeBool())));
				i++;
			}
			attributes.add(ootv);	
			params.add(param);
			statements.add(initialise);
		}

		OOTMeth<OOTType> construct = new OOTMeth<OOTType>("public",new OOTTypeNone(),name,params,statements);
		methods.add(construct);

		List<VarOccurrence> bound = this.declaredVars();
		List<OOTVar<?>> paramMethod = new ArrayList<OOTVar<?>>();

		OOTMeth<OOTType> meth = null;
		statements = new ArrayList<OOTStatement>();
		statements = getBody().code();
		Iterator<VarOccurrence> itBound = bound.iterator();
		while(itBound.hasNext()) {
			OOTVar<?> ootv=null;
			//System.out.println("Var : "+var.name);
			VarOccurrence var = itBound.next();
			if(var.position.type().equals(inttype.type())) {	  
				ootv = new OOTVar<OOTTypeInt>("public",var.name,new OOTTypeInt());
				paramMethod.add(ootv);
				meth = new OOTMeth<OOTType>("public",new OOTTypeInt(),"val",paramMethod,statements);
				i++;
			}	else if (var.position.type().equals(booltype.type())) {
				ootv = new OOTVar<OOTTypeBool>("public",var.name,new OOTTypeBool());
				paramMethod.add(ootv);
				meth = new OOTMeth<OOTType>("public",new OOTTypeBool(),"val",paramMethod,statements);
				i++;
			} else {
				ootv = new OOTVar<OOTTypeClass>("public",var.name,new OOTTypeClass(name));
				paramMethod.add(ootv);
				meth = new OOTMeth<OOTType>("public",new OOTTypeClass(name),"val",paramMethod,statements);
				i++;
			}
		}	  
		methods.add(meth);

		OOTClass classe = new OOTClass(modifiers,name,"",generictypes,attributes,methods);
		classe.genCodeNode(name+".java");

		Iterator<OOTVar<?>> itB = attributes.iterator();
		while(itB.hasNext()) {
			OOTVar<OOTTypeClass> var =  (OOTVar<OOTTypeClass>) itB.next();
			OOTVarCall<OOTTypeClass> vc = new OOTVarCall<OOTTypeClass>(var);
			ListeExpr.add(vc);
		}

		/* Initialisation de la liste de statement � renvoyer */

		OOTVar<OOTTypeClass> var =  new OOTVar<OOTTypeClass>("public",getArg().getName(),new OOTTypeClass(name));
		OOTStatement dec = new OOTVarCall<OOTTypeClass>(var);
		listeRes.add(dec);
		OOTAssign<OOTTypeClass> as = new OOTAssign<OOTTypeClass>(new OOTTypeClass(name),var,new OOTClassNew(classe,ListeExpr));
		listeRes.add(as);
		List<OOTVar<?>> listeAppelante = new ArrayList<OOTVar<?>>();
		listeAppelante.add(var);
		OOTMethConnu methC = new OOTMethConnu(listeAppelante,"","");
		listeRes.add(methC);

		return listeRes;
	}


}
/* JavaCC - OriginalChecksum=02c14a4558d4f3a69585b646acddebec (do not edit this line) */
