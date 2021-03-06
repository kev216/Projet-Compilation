import java.io.*;
import java.util.*;

/* Generated By:JJTree: Do not edit this line. ASTAdd.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */

public class ASTAdd extends SimpleNode implements Type {
	
	public ASTAdd(int id) {
		super(id);
	}

	public ASTAdd(Parser p, int id) {
		super(p, id);
	}

	public Node getLeft() { return (Node)jjtGetChild(0);}
	public Node getRight() { return (Node)jjtGetChild(1);}

	public Type type() throws TypeException {
		Node left = this.getLeft();
		Node right = this.getRight();
		ASTInt inttype = new ASTInt(ParserTreeConstants.JJTTYPE);
		inttype.jjtSetValue("Int");
		if(!right.type().equals(inttype.type())  || !left.type().equals(inttype.type()))
			{
				throw new TypeException("A part of two is not INT !");
			}
		return left.type();	  
	}


	public List<OOTStatement> code() throws TypeException {
		
		OOTNode left=null;
		OOTNode right=null;
		OOTOper add=null;
		
		List<OOTStatement> ls = new ArrayList<OOTStatement>();
		int i=0;
		
		//left part
		
		if(this.getLeft() instanceof ASTTermVar) {//1.variable
			ASTTermVar l = (ASTTermVar)this.getLeft();
			left = new OOTVar<OOTTypeInt>("public",l.getName(),new OOTTypeInt());
			//System.out.println();
			} 
			else if(this.getLeft() instanceof ASTAdd || this.getLeft() instanceof ASTMult || this.getLeft() instanceof ASTOpp) {
			//les autre oppp.
			ls.addAll(getLeft().code());
			left = ls.get(i);
			i++;
			//System.out.println(left);
			}
				else {
					//il est une node, puis ajoute dans une liste	 
					SimpleNode l = (SimpleNode)this.jjtGetChild(0);
					left = new OOTConstant<OOTTypeInt>(new OOTTypeInt(),String.valueOf(l.jjtGetValue())); 
		}

		//Right part
		
		if(this.getRight() instanceof ASTTermVar) {
				ASTTermVar r = (ASTTermVar) this.getRight();
			    right = new OOTVar<OOTTypeInt>("public",r.getName(),new OOTTypeInt());
			    add = new OOTOper(left,right,"+");
			}
				else if(this.getRight() instanceof ASTAdd || this.getRight() instanceof ASTMult || this.getRight() instanceof ASTOpp) 
						{
							ls.addAll(this.getRight().code()) ;
							right = ls.get(i);
							i++;
						} else {
							SimpleNode r = (SimpleNode)this.jjtGetChild(1);
							right = new OOTConstant<OOTTypeInt>(new OOTTypeInt(),String.valueOf(r.jjtGetValue()));
							add = new OOTOper(left,right,"+");
								}
					
		add= new OOTOper(left,right,"+");
		ls = new ArrayList<OOTStatement>();
		ls.add(add);
		return ls;
	}

}
/* JavaCC - OriginalChecksum=65e5ae1097cf6a10b16894ca2f145599 (do not edit this line) */
