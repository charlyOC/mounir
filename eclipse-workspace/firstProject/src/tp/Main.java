package tp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Apprenant charly = new Apprenant("charly", "dewalles", "java", 2);
//		Apprenant kevin = new Apprenant("kevin", "arnaud", "java", 3);
//		Apprenant bobby = new Apprenant("bobby", "bob", "java", 1); 
//		Apprenant alex = new Apprenant("gerard", "steeven", "java", 3); 
	
//		ArrayList <Apprenant> listLearner = new ArrayList<Apprenant>(); 
//		
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("entrez un pr�nom");
//	    String firstName = sc.nextLine(); 
//
//	    
//	    System.out.println("entrez un nom");
//	    String lastName = sc.nextLine(); 
//	    
//	
//	    
//	    Apprenant input = new Apprenant(firstName, lastName, "java", 3); 
//	    listLearner.add(new Apprenant("charly", "dewalles", "java", 2)); 
//		listLearner.add(new Apprenant("kevin", "arnaud", "java", 3));
//		listLearner.add(new Apprenant("guillaume", "lesenne", "java", 3));
//		listLearner.add(new Apprenant("beno�t", "patou", "java", 1));
//		listLearner.add(input);
//		
//		for (Apprenant apprenant : listLearner) {
//			if (apprenant.getLevel() == 3)
//			System.out.println(apprenant.getFirstName() + " " + apprenant.getLastName());
//		}
		
		
		

	    Scanner sc = new Scanner(System.in);
	    System.out.println("entrez un produit:"
	    		+ " 1.kebab (5�)  "
	    		+ "2.burger (6�) "
	    		+ "3.salade (4.50�) "
	    		+ "4.frites  (2.50�)");
	    
	    
	    String produit = sc.nextLine();
	    
	    if(produit == "kebab") {
	    	
	    }
	    

	 
	    System.out.println("entrez une quantit�");
	    int quantity = sc.nextInt();
	    
	    int totalPrice = 
	    
	    System.out.println("--------------------Ticket de caisse----------------");
	    System.out.print("|");
	    System.out.println(" description: " + produit);
	    System.out.print("|");
	    System.out.println(" quantit�: " + quantity);
	    System.out.print("|");
	    System.out.println(" prix: " + totalPrice + "�" );
	    System.out.println("-----------------------------------------------------");
	    
	     
	  
	     
	     
//		ArrayList<Apprenant> listLearner = new ArrayList<>(); 
//		
//		listLearner.add(alex); 
//		listLearner.add(bobby);
//		listLearner.add(charly);
//		listLearner.add(kevin);
//	
//		System.out.println();
		
	}

}