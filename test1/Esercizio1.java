import java.util.Scanner;

public class Esercizio1{
    public static void main(String[] args) { 
        double età, anniesperienza, certificazioni, radicequadrata;

        //creazione oggetto Scanner
        Scanner numeri = new Scanner(System.in);

        //richiesta input utente età tramite scanner
        System.out.println("Quanti anni hai? ");
        età = numeri.nextInt();
        //richiesta input utente anni esperienza tramite scanner
        System.out.println("Quanti anni di esperienza in programmazione hai?");
        anniesperienza = numeri.nextInt();
        //richiesta input utente certificazioni tramite scanner
        System.out.println("Quanti certificazioni hai?");
        certificazioni = numeri.nextInt();
        
        //calcolo radice quadrata età + esperienza tramite Math.sqrt e stampa
        radicequadrata = Math.sqrt(età + anniesperienza);
        System.out.println("Calcolo radice quadra età + esperienza é: " + radicequadrata);

        //ciclo if per controllare condizioni idoneità
        if((età >= 18 && anniesperienza >= 2) || (certificazioni >= 1 && età >= 16 && età <= 18)){
            System.out.println("Idoneo al corso");
        }
        else{
            System.out.println("Non idoneo al corso");
        }
        
    }
    }