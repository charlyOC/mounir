package tp;

public class Apprenant {
	
	private String firstName; 
	private String lastName;
	private String promo; 
	private int level;
	
	
	public Apprenant(String FirstName, String LastName, String Promo ,int Level) {
		this.firstName = FirstName; 
		this.lastName = LastName;
		this.promo = Promo; 
		this.level = Level; 
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	} 
	

}
