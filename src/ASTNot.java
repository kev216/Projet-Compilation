import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Generated By:JJTree: Do not edit this line. ASTNot.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTNot extends SimpleNode implements Type {
  public ASTNot(int id) {
    super(id);
  }

  public ASTNot(Parser p, int id) {
    super(p, id);
  }
  
  public Node getLeft() { return (Node)jjtGetChild(0);}
  public Node getRight() { return (Node)jjtGetChild(1);}
  
  public Type type() throws TypeException {
	  Node left = (Node)jjtGetChild(0);
	  ASTBool booltype = new ASTBool(ParserTreeConstants.JJTTYPE);
	  if(!left.type().equals(booltype.type()))
		  throw new TypeException("This is not a boolean");
	  return booltype.type();
  }

	public List<OOTStatement> code() throws TypeException {
		OOTNode left=null;
		OOTOper opp=null;
		List<OOTStatement> ls = new ArrayList<OOTStatement>();
		int i=0;
		if(this.getLeft() instanceof ASTTermVar) {
			ASTTermVar l = (ASTTermVar)this.getLeft();
			left = new OOTVar<OOTTypeInt>("public",l.getName(),new OOTTypeInt());
		} else if(this.getLeft() instanceof ASTAdd || this.getLeft() instanceof ASTMult || this.getLeft() instanceof ASTOpp) {
			ls.addAll(getLeft().code());
			left = ls.get(i);
			i++;
		} else {	  
			SimpleNode l = (SimpleNode)this.jjtGetChild(0);
			left = new OOTConstant<OOTTypeInt>(new OOTTypeInt(),String.valueOf(l.jjtGetValue())); 
		}

		opp= new OOTOper(left,null,"!");
		ls = new ArrayList<OOTStatement>();
		ls.add(opp);
		
		return ls;
	}

}
/* JavaCC - OriginalChecksum=29710441ed20eaf9be9395afc2e054c1 (do not edit this line) */
