package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import beans.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------------------bienvenue chez Mounir---------------------");
		
		Scanner sc = new Scanner(System.in);

		boolean isOrderDone = false;
		String answerOrderDone; 

		ArrayList<Product> listProduct = new ArrayList<Product>();
		
		do {
			System.out.println("entrez un nom de produit:");
			Product produit = new Product(null, 0, 0);

			produit.setDesc(sc.next());

			System.out.println("entrez un prix:");
			produit.setPrice(sc.nextDouble());
			
			System.out.println("t'en veux combien ?");
			produit.setQuantity(sc.nextInt());

			listProduct.add(produit);
			
				
			System.out.println("Est ce que t'as fini ? Y/n");
			answerOrderDone = sc.next();
			
			if(answerOrderDone.equals("Y")) {
				isOrderDone = !isOrderDone;
				
				double totalPrice = 0; 
				System.out.println("-------tu as command�:-------- ");
				
				for(Product product : listProduct) {
					double sousTotal = product.getPrice() * product.getQuantity();
					totalPrice += sousTotal; 
					System.out.print(product.getDesc() + "  |  ");
					System.out.print(product.getQuantity() + " * ");
					System.out.println(product.getPrice() + " �" );
	
				}
				
				System.out.println("---------------------------------------");
				System.out.print("|");
				System.out.print("   Tu dois � Mounir " + totalPrice + " � stp");
				System.out.println("       |");
				System.out.print("---------------------------------------");

			} 
			
		} while (!isOrderDone);

	}

} 