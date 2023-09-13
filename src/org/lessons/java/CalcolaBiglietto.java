package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		int NumKm = sc.nextInt();
		
		System.out.print("Inserisci la tua etá: ");
		int Age = sc.nextInt();
		
		sc.close();
		
		float PriceKm = 0.21F;
		float TicketPrice = PriceKm * NumKm;
		float Discount = 0;
		float TicketDiscount;
		
		if(Age >= 18){
		 Discount = (TicketPrice * 20) / 100;
		 TicketDiscount = TicketPrice - Discount;
		 System.out.print("Il prezzo del tuo biglietto è:" + TicketDiscount + "€");
		
		}else if(Age >= 65) {
			Discount = (TicketPrice * 40) / 100;
			TicketDiscount = TicketPrice - Discount;
			System.out.print("Il prezzo del tuo biglietto è:" + TicketDiscount + "€");
			
		}else {
			System.out.print("Il prezzo del tuo biglietto è: " + TicketPrice + "€");
		}
	}
}
