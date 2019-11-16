/**
 * 
 */
package ZadaniePerson;

/**
 * @author 108304
 *
 */
public class Teacher extends UniversityPerson {
	
	boolean teacherStatus = false;
	boolean studentStatus = false;

	Teacher(String promptedName, String promptedUniversityId, boolean isTeacher) {
		super(promptedName, promptedUniversityId);
		// TODO Auto-generated constructor stub
		this.teacherStatus = isTeacher;
	}
	
	@Override
	public void isTeacher() {
		if(teacherStatus) {
			System.out.println("Teacher is here!");
		}
	}

	@Override
	public void isStudent() {
		// TODO Auto-generated method stub
		if(studentStatus) {
			System.out.println("Student here!");
		}
	}

	@Override
	public void hasEmail() {
		// TODO Auto-generated method stub
		System.out.println("Nope!");
	}

	@Override
	public void hasId() {
		// TODO Auto-generated method stub
		System.out.println("Yes! It's: "+super.universityId+".");
	}
}
