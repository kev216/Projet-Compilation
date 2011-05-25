

/**
 * This interface accounts for all declarations on the intermediate language.
 * Because declarations are usually OK statements in OO languages, we leave it to extend OOTStatement.
 * @param T is the type of the declared thing, if known at compile time, otherwise put OOTType. 
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time.
 */
public interface OOTDec<T extends OOTType> extends OOTStatement {
	
	public String genCodeDec(String nameFile);
}
