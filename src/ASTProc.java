public class ASTProc extends SimpleNode implements Type {
	public ASTProc(int id) {
	    super(id);
	  }

	  public ASTProc(Parser p, int id) {
	    super(p, id);
	  }
	  
	  public Type type() {
		  
		  ASTType procType=new ASTType(ParserTreeConstants.JJTTYPE);
		  procType.jjtSetValue("Proc");
		  return procType;
	  }
	  
	  public boolean equals(Object o) {
		  if(o instanceof ASTProc)
			  return true;
		  return false;
	  }
	  
}