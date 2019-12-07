/**
 * 
 */
package people;

import java.util.*;

/**
 * @author 108304
 *
 */

public class People {

	private String name;
	private String surname;
	private int age;

	public People(String tmpName, String tmpSurname, int tmpAge) {
		this.setAge(tmpAge);
		this.setName(tmpName);
		this.setSurname(tmpSurname);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showPersonData() {
		System.out.println("Name: " + this.getName() + ". Surname: " + this.getSurname() + ". Age: " + this.getAge());
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        People other = (People) obj;
        if ((name != other.name) &&
        		(surname != other.surname) &&
        		(age != other.age)) return false;
        return true;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<People> school = new HashSet<>();
		school.add(new People("John", "Doe", 21));
		school.add(new People("Jane", "Doe", 43));
		System.out.println("========================= First set =========================");
		for (People i : school) {
			i.showPersonData();
		}
		HashSet<People> school2 = new HashSet<>();
		school2.add(new People("John", "Doe", 21));
		school2.add(new People("Jane", "Doe", 43));
		System.out.println("========================= Second set =========================");
		for (People k : school2) {
			k.showPersonData();
		}
		boolean value = school.equals(school2);
		System.out.println("Are both are equal: " + value);
	}
}
