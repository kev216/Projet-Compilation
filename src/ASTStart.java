import java.io.IOException;
import java.util.List;


/* Generated By:JJTree: Do not edit this line. ASTStart.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTStart extends SimpleNode {
  public ASTStart(int id) {
    super(id);
  }

  public ASTStart(Parser p, int id) {
    super(p, id);
  }

  public Type type() throws TypeException{
	  return jjtGetChild(0).type();	  
  }
  
  public List<OOTStatement> code() throws TypeException {
	  return jjtGetChild(0).code();
  }
  
}
/* JavaCC - OriginalChecksum=353829dc04121b602da71ff7d7fc4d24 (do not edit this line) */