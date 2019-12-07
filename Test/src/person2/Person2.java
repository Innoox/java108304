/**
 * 
 */
package person2;

import java.util.*;

/**
 * @author 108304
 *
 */

class NameCompare implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Person2 p1 = (Person2)o1;
		Person2 p2 = (Person2)o2;
		return p1.getName().compareTo(p2.getName());
	}
	
}

public class Person2 implements Comparable<Person2>{
	
	private String name;
	private String surname;
	private int age;
	
	public Person2(String tmpName, String tmpSurname, int tmpAge) {
		this.setAge(tmpAge);
		this.setName(tmpSurname);
		this.setSurname(tmpSurname);
	}
	
	public String getName() {
		return name;
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
		System.out.println("Name: "+this.getAge()+"\nSurname: "+this.getSurname()+"\nAge: "+this.getAge());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person2> school = new ArrayList<>();
		Person2 John = new Person2("John", "Doe", 21);
		Person2 Jane = new Person2("Jane", "Doe", 43);
		Person2 Some = new Person2("Name", "Surname", 99);
		Person2 NewOne = new Person2("Newbie", "Atuck", 53);
		school.add(John);
		school.add(Jane);
		school.add(Some);
		school.add(NewOne);
		System.out.println("========================= Comprable by age =========================");
		Collections.sort(school);
		for(Person2 i : school)
		{
			System.out.println("Name: "+i.getName()+". Surname: "+i.getSurname()+". Age: "+i.getAge());
		}
		System.out.println("========================= Comparator by name =========================");
		Collections.sort(school, new NameCompare());
		for(Person2 i : school) {
			System.out.println("Name: "+i.getName()+". Surname: "+i.getSurname()+". Age: "+i.getAge());
		}
	}

	@Override
	public int compareTo(Person2 arg0) {
		// TODO Auto-generated method stub
		if(this.age == arg0.age) return 0;
		else if (this.age > arg0.age) return 1;
		else return -1;
	}
}
