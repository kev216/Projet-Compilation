//************************************************
// AUTHOR: Pablo Arrighi (pablo.arrighi@imag.fr)
// DATE: January 2008
//************************************************

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Happy {

  public static void main(String[] args) {
	Parser parser;
	ASTStart t;
	if (args.length == 0) {
		System.out.println("Reading from standard input...");
		System.out.println("End with a dot (.) followed by CR.");
		parser = new Parser(System.in);
	} else if (args.length == 1) {
		System.out.println("Reading from file " + args[0] + "...");
		try {
			parser = new Parser(new java.io.FileInputStream(args[0]));
		} catch (java.io.FileNotFoundException e) {
			System.out.println("File " + args[0] + " not found.");
			return;}
	} else {
	System.out.println("Usage is one of:");
	System.out.println(" java Parser");
	System.out.println("OR");
	System.out.println(" java Parser inputfile");
	return;
	}
	try {
		System.out.println("Parsing...");
		t=Parser.start();
		System.out.println("Parsed OK.");
		System.out.println("--- begin dump ---");		
		t.dump("");
		System.out.println("--- end dump ---");	
		System.out.println("Name analysis...");
		List<VarOccurrence> l=t.findFreeBound(new ArrayList<VarOccurrence>());
		System.out.println("The undeclared variables are "+l);
		System.out.println("The AST has been modified to account for bindings.");		
		System.out.println("--- begin dump ---");		
		t.dump("");
		System.out.println("--- end dump ---");	
		System.out.println("Type checking...");
		Type type=t.type();
		System.out.println("Term is of type ");
		type.dump("");
		System.out.println("---begin compilation ---");
		t.code();
		System.out.println("--- end compilation ---");
    } 
	catch (ParseException e) {
	System.out.println("Encountered errors during parse:");
	System.out.println(e.getMessage());
	}
    catch (TypeException e) {
   	System.out.println("Encountered errors during typing.");
   	System.out.println(e.getMessage());
   	e.printStackTrace();   	
    }
    
	}
}