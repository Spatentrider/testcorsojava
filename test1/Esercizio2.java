import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        //dichiarazione variabili
        String articolo;
        int contatore = 0;
        //creazione arraylist e scanner
        ArrayList articoli = new ArrayList<>();

        Scanner stringhe = new Scanner(System.in);

         //richiesta input utente
        do{
            System.out.println("Aggiungi articoli al carrello o fine per terminare");
            articolo = stringhe.nextLine();
            //controllo per terminare input
            if(!articolo.equals("fine")){
                    articoli.add(articolo);
                    contatore++;
                    System.out.println("Articolo aggiunto");
                }
                
        }while(!articolo.equals("fine"));

    //stampa quantità e articoli
    System.out.println("\nHai inserito " + contatore + " articoli:"); 
    System.out.println(articoli);

    //controllo condizione messaggio speciale
    if(articoli.contains("pane") && articoli.contains("latte")){
        System.out.println("Hai pensato alla colazione!");
    }
}
}
    
