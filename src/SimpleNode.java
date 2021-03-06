import java.io.IOException;
import java.util.*;

/* Generated By:JJTree: Do not edit this line. SimpleNode.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class SimpleNode implements Node {

  protected Node parent;
  protected Node[] children;
  protected int id;
  protected Object value;
  protected Parser parser;

  
/* THE CODE THAT I WANT COMMON TO ALL ASTXXX CLASSES */

  public List<VarOccurrence> findFreeBound(List<VarOccurrence> boundvars){
	  List<VarOccurrence> b=new ArrayList<VarOccurrence>();
	  if (this instanceof Binder)
	  {b.addAll(((Binder) this).declaredVars());}
	   //now the bounded variables also include the variables just declared in this node
	  b.addAll(boundvars);
	  List<VarOccurrence> l=new ArrayList<VarOccurrence>();
	  for (int i=0;i<jjtGetNumChildren();i++ )
	  {
		  l.addAll(jjtGetChild(i).findFreeBound(b));
	  }
	  return l;
  }

  public Type type() throws TypeException {
	  return null;
  }
  
  
 
  /* JJTREE GENERATED STUFF */
  
  public SimpleNode(int i) {
    id = i;
  }

  public SimpleNode(Parser p, int i) {
    this(i);
    parser = p;
  }

  public void jjtOpen() {
  }

  public void jjtClose() {
  }

  public void jjtSetParent(Node n) { parent = n; }
  public Node jjtGetParent() { return parent; }
  
  
  public Node jjtGetRootParent() {
	  Node p = this;
	  while(p.jjtGetParent() != null && p.toString() != "New")
		  p = p.jjtGetParent();
	  return p;
  }

  public void jjtAddChild(Node n, int i) {
    if (children == null) {
      children = new Node[i + 1];
    } else if (i >= children.length) {
      Node c[] = new Node[i + 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = n;
  }

  public Node jjtGetChild(int i) {
    return children[i];
  }

  public int jjtGetNumChildren() {
    return (children == null) ? 0 : children.length;
  }

  public void jjtSetValue(Object value) { this.value = value; }
  public Object jjtGetValue() { return value; }

  /* You can override these two methods in subclasses of SimpleNode to
     customize the way the node appears when the tree is dumped.  If
     your output uses more than one line you should override
     toString(String), otherwise overriding toString() is probably all
     you need to do. */

  public String toString() { return ParserTreeConstants.jjtNodeName[id]; }
  public String toString(String prefix) { return prefix + toString(); }

  /* Override this method if you want to customize how the node dumps
     out its children. */

  public void dump(String prefix) {
    System.out.println(toString(prefix));
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        SimpleNode n = (SimpleNode)children[i];
        if (n != null) {
          n.dump(prefix + " ");
        }
      }
    }
  }
  
  public List<OOTStatement> code() throws TypeException {
	  List<OOTStatement> ls = new ArrayList<OOTStatement>();
	  for (int i=0;i<jjtGetNumChildren();i++ )
	  {
		  ls.addAll(jjtGetChild(i).code());//scan by row.
	  }  
	  return ls;
  }
  

}

/* JavaCC - OriginalChecksum=a36bd50763b697bcf2842b79c24e182d (do not edit this line) */
