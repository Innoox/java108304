/**
 * 
 */
package people;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * @author 108304
 *
 */

public class People implements Comparable{

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

//	@Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        People other = (People) obj;
//        if ((name != other.name) &&
//        		(surname != other.surname) &&
//        		(age != other.age)) return false;
//        return true;
//    }
//
//	@Override
//	public int compareTo(Object o) {
//		if (this == obj)
//			return 1;
//		if (obj == null)
//			return 0;
//		if (getClass() != obj.getClass())
//			return 0;
//		People other = (People) obj;
//		if ((name != other.name) &&
//				(surname != other.surname) &&
//				(age != other.age)) return 0;
//		return 1;
//	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof People)) return false;
		People people = (People) o;
		return getAge() == people.getAge() &&
				getName().equals(people.getName()) &&
				Objects.equals(getSurname(), people.getSurname());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getSurname(), getAge());
	}

	@Override
	public int compareTo(Object o) {
		if (this == o)
			return 1;
		if (o == null)
			return 0;
		if (getClass() != o.getClass())
			return 0;
		People other = (People) o;
		if ((name != other.name) &&
				(surname != other.surname) &&
				(age != other.age)) return 0;
		return 1;
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

		// TreeSet
		TreeSet<People> set1 = new TreeSet<>();
		set1.add(new People("John", "Doe", 21));
		set1.add(new People("Jane", "Doe", 43));
		set1.add(new People("John", "Doe", 21));
		System.out.println("TreeSet print..\n");
		for (People tmp : set1) {
			System.out.println("Name: " + tmp.name + ". Surname: " + tmp.surname + ". Age: " + tmp.age);
		}
	}
}
