package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		float PriceKm = 0.21F;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		int NumKm = sc.nextInt();
		
		System.out.print("Inserisci la tua etá: ");
		int Age = sc.nextInt();
		
		sc.close();
		
		float TicketPrice = PriceKm * NumKm;
		
		if(Age < 18){
			
			TicketPrice = TicketPrice / 100 * 80;
		
		}else if(Age > 65) {

			TicketPrice = TicketPrice / 100 * 60;
			
		}
		
		System.out.print("Il prezzo del tuo biglietto è:" + String.format("%.02f", TicketPrice) + "€");
	}
}
