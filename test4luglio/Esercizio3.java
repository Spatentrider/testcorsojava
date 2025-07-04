import java.util.ArrayList;
import java.util.Scanner;

class Cadetto{
    protected int codice;
    Cadetto(int codice){
        this.codice = codice;
    }

    public void stampaInfo(){
        System.out.println("Codice cadetto" + codice);
    }

}

class Cadetto2 extends Cadetto{

    private int anno;
    
    Cadetto2(int codice, int anno){
        super(codice);
        this.anno = anno;
    }

    @Override
    public void stampaInfo(){
        System.out.println("Codice cadetto" + codice + "Anno " + anno);
    }

}

class Cadetto3 extends Cadetto{

    private String inno;
    
    Cadetto3(int codice, String inno){
        super(codice);
        this.inno = inno;
    }

    @Override
    public void stampaInfo(){
        System.out.println("Codice cadetto" + codice + "Inno" + inno);
        
    }

}

class Cadetto4 extends Cadetto{

    private String ruolo;
    
    Cadetto4(int codice, String ruolo){
        super(codice);
        this.ruolo = ruolo;
    }

    @Override
    public void stampaInfo(){
        System.out.println("Codice cadetto" + codice + "Arma" + ruolo);
        
    }

}




public class Esercizio3 {

    public static void main(String[] args) {

        //creazione oggetto Scanner
        Scanner scanner = new Scanner(System.in);
        Scanner scannernumeri = new Scanner(System.in);

        ArrayList<Cadetto> truppa = new ArrayList<>();
        //Creazione attributi per prendere input utente
        int inputnumero;
        String input;

        //ciclo do while per prendere input utente
        do {
            System.out.println("Inserisci 1 per creare  Cadetto2, 2 per Cadetto3, 3 per Cadetto4");

            //assegnazione input utente tramite metodo di scanner
            inputnumero = scannernumeri.nextInt();
            //switch per check input
            switch (inputnumero) {
                case 1:
                //creazione oggetto Cheeseburger e aggiunto all'ArrayList
                    Cadetto2 cadetto2 = new Cadetto2(333, 2020);
                    cadetto2.stampaInfo();
                    break;
                case 2:
                //creazione oggetto Vegburger e aggiunto all'ArrayList
                    Cadetto3 cadetto3 = new Cadetto3(333, "prova");
                    cadetto3.stampaInfo();
                    break;
                case 3:
                //creazione oggetto DoubleBacon e aggiunto all'ArrayList
                    Cadetto4 cadetto4 = new Cadetto4(333, "cecchino");
                    cadetto4.stampaInfo();
                    break;
                default:
                    //stampa di errore
                    System.out.println("Comando non valido.");
                    break;
            }

            //richiesta input per continuare
            System.out.println("Vuoi continuare? (si/no)");
            input = scanner.nextLine(); // legge la risposta dell'utente
        } while (!input.equals("no")); //se input = no esce dal ciclo

        System.out.println("Programma terminato");
    }
        
    }
    

