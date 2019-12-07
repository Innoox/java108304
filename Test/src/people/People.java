/**
 * 
 */
package people;

import java.util.*;

/**
 * @author 108304
 *
 */

public class People{
	
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
		System.out.println("Name: "+this.getName()+". Surname: "+this.getSurname()+". Age: "+this.getAge());
	}
	@Override
	public boolean equals(Object o) {
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<People> school = new HashSet<>();
//		People John = new People("John", "Doe", 21);
//		People Jane = new People("Jane", "Doe", 43);
//		People Some = new People("Name", "Surname", 99);
//		People NewOne = new People("Newbie", "Atuck", 53);
//		school.add(John);
//		school.add(Jane);
//		school.add(Some);
//		school.add(NewOne);
//		school.add(new People("John", "Doe", 21));
//		school.add(new People("Jane", "Doe", 43));
		school.add(new People("John", "Doe", 21));
		school.add(new People("School2P1", "SurnameP1", 31));
		school.add(new People("Jane", "Doe", 43));
		school.add(new People("School2P2", "SurnameP2", 13));
		System.out.println("========================= First set =========================");
		for(People i : school) {
			i.showPersonData();
		}
		HashSet<People> school2 = new HashSet<>();
		school2.add(new People("John", "Doe", 21));
		school2.add(new People("School2P1", "SurnameP1", 31));
		school2.add(new People("Jane", "Doe", 43));
		school2.add(new People("School2P2", "SurnameP2", 13));
		System.out.println("========================= Second set =========================");
		for(People k : school2) {
			k.showPersonData();
		}
		boolean value = school.equals(school2);
		System.out.println("Are both are equal: "+value);
	}
}
