
/**
 * This interface is implemented by all things yielding a value
 * in the intermediate language.
 * Because expressions are frequently voided to be used as statements in 
 * OO languages, our expressions can also be statements
 * @param T is the type of the value, if known at compile time, otherwise put OOTType. 
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time.
 */
public interface OOTExpr<T extends OOTType> extends OOTStatement {
	public String genCodeExpr(String nameFile);

	public String genCodeParam(String nameFile);

}
