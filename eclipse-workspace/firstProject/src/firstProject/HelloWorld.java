package firstProject;

public class HelloWorld {

	public static void main(String[] args) {
		int note = 20; 
		
		if(note >= 16) {
			System.out.println("Tr�s bien");
		} else if(note >= 14 && note <= 16) {
			System.out.println("Bien");
		} else if(note >= 12 && note <= 14) {
			System.out.println("asssez bien");
		} else if(note >= 10 && note <= 12) {
			System.out.println("passable");
		} else if(note >= 8 && note <= 10) {
			System.out.println("rattrapage");
		} else if (note < 8) {
			System.out.println("recal�");
		}
			Personne one = new Personne(); 
			one.setFirstName("bobby");
			one.setAge(23);
			System.out.println(one.getFirstName());  
			System.out.println(one.getAge());  
			
	}

}