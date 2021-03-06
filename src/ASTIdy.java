/* Generated By:JJTree: Do not edit this line. ASTIdy.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTIdy extends SimpleNode {
  public ASTIdy(int id) {
    super(id);
  }

  public ASTIdy(Parser p, int id) {
    super(p, id);
  }
  public Type type() throws TypeException {
	  ASTTermVar left = (ASTTermVar)jjtGetChild(0);
	  ASTTermVar right = (ASTTermVar)jjtGetChild(1);
	  ASTType reftype = new ASTType(ParserTreeConstants.JJTTYPE);
	  reftype.jjtSetValue("Ref");
	  if(!left.type().equals(right.type()) || !left.type().equals(reftype.type()))
		  throw new TypeException("One of the two parts is not Reference");
	  ASTType booltype=new ASTType(ParserTreeConstants.JJTTYPE);
	  booltype.jjtSetValue("Bool");
	  return booltype;
  }
  
  public boolean equals(Object o) {
	  if(o instanceof ASTIdy)
		  return true;
	  return false;
  }

}
/* JavaCC - OriginalChecksum=eebf0945e2be4cedfb2a229156f62834 (do not edit this line) */
