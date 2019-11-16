/**
 * 
 */
package ZadaniePerson;

/**
 * @author 108304
 *
 */
public class Student extends UniversityPerson {
	
	boolean studentStatus = false;
	boolean teacherStatus = false;

	Student(String promptedName, String promptedUniversityId, boolean isStudent) {
		super(promptedName, promptedUniversityId);
		// TODO Auto-generated constructor stub
		this.studentStatus = isStudent;
	}
	
	@Override
	public void isStudent() {
		if(studentStatus) {
			System.out.println("Student here!");
		}
	}
	
	@Override
	public void isTeacher() {
		if(teacherStatus) {
			System.out.println("Teacher is here!");
		}
	}

	@Override
	public void hasId() {
		// TODO Auto-generated method stub
		System.out.println("Yes! It's: "+super.universityId+".");
	}

	@Override
	protected void hasEmail() {
		// TODO Auto-generated method stub
		System.out.println("Nope!");
	}
}
