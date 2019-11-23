package ZadaniePerson;

public class VipPerson extends Person {

	String email = "";
	
	VipPerson(String promptedName, String promptedEmail) {
		super(promptedName);
		// TODO Auto-generated constructor stub
		this.email = promptedEmail;
	}

	public void hasEmail() {
		System.out.println("Yes! It's: "+this.email+".");
	}

	@Override
	protected void hasId() {
		// TODO Auto-generated method stub
		System.out.println("Nope!");
	}
}
