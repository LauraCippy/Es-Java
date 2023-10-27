package package1;

import java.util.Scanner;

public class EsprVariabMathInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


//		## Esercizio NomeCognome
//
//		Scrivere un programma NomeCognome che scrive il vostro nome e il vostro cognome uno
//		sotto l’altro.

	System.out.println("Laura\nComparelli");

	System.out.println("-----------------------------------------");	
//		## Esercizio RadiceQuadrata
//
//		Scrivere un programma `RadiceQuadrata` che chiede all’utente di insere un numero intero e ne stampa la radice quadrata (numero frazionario).Usa la classe `java.lang.Math`
//
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero intero");
		int numeroIntero = input.nextInt();
		
		double radice = Math.sqrt(numeroIntero);
		System.out.println("La radice quadrat è: "+radice);

		
		System.out.println("-----------------------------------------");	
//		
//		## Esercizio PerimetroRettangolo
//
//		Scrivere un programma PerimetroRettangolo che calcola il perimetro di un rettangolo di base e altezza inserite dall'utente.

		Scanner lato = new Scanner(System.in);
		System.out.println("Inserisci base e altezza del rettangolo");
		int base = lato.nextInt();
		int altezza = lato.nextInt();
		
		int perimetro  = (base*2)+(altezza*2);
		System.out.println("Il perimetro è: "+perimetro);
		
		System.out.println("-----------------------------------------");	
//		
//		## Esercizio AreaCerchio
//
//		Scrivere un programma AreaCerchio che chiede all’utente di inserire la lunghezza del raggio di un cerchio e ne calcola l’area. 
//		ATTENZIONE: memorizzare il valore di pi-greco in una costante.

		Scanner raggio = new Scanner(System.in);
		System.out.println("Inserisci raggio");
		int r = raggio.nextInt();
		
		final double pi = 3.14159265;
		
		double area = pi*(r*r);
		System.out.println("L'area è: "+area);
		
		System.out.println("-----------------------------------------");	
//		
//		## Esercizio Divisione
//
//		Scrivere un programma Divisione che chiede all’utente due numeri interi e stampa prima il quoziente della loro divisione intera e poi il resto.
		Scanner numer = new Scanner(System.in);
		System.out.println("Inserisci divisore e dividendo");
		int divisore = numer.nextInt();
		int dividendo = numer.nextInt();
		
		double divisione = dividendo/divisore;
		double resto =  dividendo%divisore;
		System.out.println("La divisione è: "+divisione+".\nIl resto è: "+resto);
		
		System.out.println("-----------------------------------------");	
//		## Esercizio SommaProdotto
//		Scrivere un programma SommaProdotto che chiede all’utente di inserire due valori interi e ne calcola la somma e il prodotto.
		
		Scanner num = new Scanner(System.in);
		System.out.println("Inserisci due numeri interi");
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		
		int somma = num1+num2;
		int prodotto = num1*num2;
		System.out.println("La somma è: "+somma+".\nIl prodotto è: "+prodotto);
		System.out.println("-----------------------------------------");	
//		## Esercizio SommaDiQuattro
//
//		Scrivere un programma SommaDiQuattro che chiede all’utente di inserire quattro valori interi, e ne stampa la somma. 
//		ATTENZIONE: il programma deve utilizzare in tutto solo 2 variabili!
		
		Scanner n = new Scanner(System.in);
		System.out.println("Inserisci 4 numeri interi");
		int[] numeri = {n.nextInt(),n.nextInt(),n.nextInt(),n.nextInt()};
		
		int i = 0;
		
		for(i=0; i<numeri.length;i++) {
			somma +=numeri[i];
		}
		System.out.println("La somma è: "+somma);
		
		System.out.println("-----------------------------------------");	
//		## Esercizio SommaApprossimata
//
//		Scrivere un programma SommaApprossimata che chiede all’utente di inserire due numeri
//		con la virgola, li somma e poi stampa il risultato come numero intero.
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Inserisci due numeri con la virgola");
		double vir1 = input2.nextDouble();
		double vir2 = input2.nextDouble();
		
		int somma2 = (int) (vir1+vir2);
		System.out.println("La somma è: "+somma2);
		
		System.out.println("-----------------------------------------");	
//		## Esercizio OreInMinuti
//
//		Scrivere un programma OreInMinuti che chiede all’utente di inserire un numero frazionario che rappresenta un tempo espresso in ore (ad esempio 3.5 per 3 ore e mezzo) e stampa il corrispondente tempo espresso in minuti (ad esempio 210). 
//		Il risultato stampato deve essere un numero intero (ossia, NON deve essere 210.0).
		
		Scanner ore = new Scanner(System.in);
		System.out.println("Inserisci le ore frazionate");
		double ora = ore.nextDouble();
		
		int minuti = (int) ora*60;
		System.out.println("I minuti sono: "+minuti);
		
		System.out.println("-----------------------------------------");	
//		## Esercizio MinutiInOre
//
//		Scrivere un programma MinutiInOre che chiede all’utente di inserire un numero intero che rappresenta un tempo espresso in minuti (ad esempio 210) e stampa il corrispondente tempo espresso in ore e minuti (ad esempio 3 ore e 30 minuti). 
//		Il risultato stampato deve essere un numero intero (ossia, NON deve essere 3.0 ore e 30.0 minuti).

		Scanner min = new Scanner(System.in);
		System.out.println("Inserisci le ore frazionate");
		double minut = min.nextDouble();
		
		int ora2 = (int) minut/60;
		System.out.println("I minuti sono: "+ora2);
		
		


	}
}
