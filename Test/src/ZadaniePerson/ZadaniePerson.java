/**
 * 
 */
package ZadaniePerson;

/**
 * @author 108304
 *
 */
public class ZadaniePerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person vip = new VipPerson("John", "john@sample.com");
		Person teacher = new Teacher("Doe", "105006", true);
		Person student = new Student("Marry", "205617", true);
		System.out.print("Vip person name is: "+vip.name+"; Email?: ");
		vip.hasEmail();
		System.out.print("Teacher name is: "+teacher.name+". University id is: ");
		teacher.hasId();
		System.out.print("Student name is: "+student.name+". University id is: ");
		student.hasId();
	}

}
