/**
 * 
 */
package ZadaniePerson;

/**
 * @author 108304
 *
 */
public abstract class Person {
	
	String name = "";

	Person(String promptedName){
		this.name = promptedName;
	}

	protected abstract void hasEmail();
	protected abstract void hasId();
}