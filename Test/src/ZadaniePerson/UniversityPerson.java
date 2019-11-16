/**
 * 
 */
package ZadaniePerson;

/**
 * @author 108304
 *
 */
public abstract class UniversityPerson extends Person {
	
	String universityId = "";

	UniversityPerson(String promptedName, String promptedUniversityId) {
		super(promptedName);
		// TODO Auto-generated constructor stub
		this.universityId = promptedUniversityId;
	}
	
	public abstract void hasId();	
	public abstract void isTeacher();
	public abstract void isStudent();

}
