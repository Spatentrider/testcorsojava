import java.util.ArrayList;
import java.util.Scanner;

class Veicolo {
    private String marca;
    private String modello;
    private int anno;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public void dettagli() {
        System.out.println("Veicolo: marca " + marca + ", modello " + modello + ", anno " + anno);
    }
}

class Auto extends Veicolo {
    private int numeroPorte;

    Auto(String marca, String modello, int anno, int numeroPorte) {
        super(marca, modello, anno);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void dettagli() {
        System.out.println("Auto: marca " + getMarca() + ", modello " + getModello() + ", anno " + getAnno() + ", numero porte: " + numeroPorte);
    }
}

class Moto extends Veicolo {
    private String tipoManubrio;

    Moto(String marca, String modello, int anno, String tipoManubrio) {
        super(marca, modello, anno);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void dettagli() {
        System.out.println("Moto: marca " + getMarca() + ", modello " + getModello() + ", anno " + getAnno() + ", tipo di manubrio: " + tipoManubrio);
    }
}

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veicolo> veicoli = new ArrayList<>();
        int scelta;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Crea un'auto");
            System.out.println("2. Crea una moto");
            System.out.println("3. Mostra tutti i veicoli");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci la marca: ");
                    String marcaAuto = scanner.nextLine();
                    System.out.print("Inserisci il modello: ");
                    String modelloAuto = scanner.nextLine();
                    System.out.print("Inserisci l'anno: ");
                    int annoAuto = scanner.nextInt();
                    System.out.print("Inserisci il numero di porte: ");
                    int porte = scanner.nextInt();
                    scanner.nextLine();
                    Auto auto = new Auto(marcaAuto, modelloAuto, annoAuto, porte);
                    veicoli.add(auto);
                    System.out.println("Auto aggiunta.");
                    break;

                case 2:
                    System.out.print("Inserisci la marca: ");
                    String marcaMoto = scanner.nextLine();
                    System.out.print("Inserisci il modello: ");
                    String modelloMoto = scanner.nextLine();
                    System.out.print("Inserisci l'anno: ");
                    int annoMoto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci il tipo di manubrio: ");
                    String manubrio = scanner.nextLine();
                    Moto moto = new Moto(marcaMoto, modelloMoto, annoMoto, manubrio);
                    veicoli.add(moto);
                    System.out.println("Moto aggiunta.");
                    break;

                case 3:
                    if (veicoli.isEmpty()) {
                        System.out.println("Nessun veicolo inserito.");
                    } else {
                        System.out.println("Elenco dei veicoli:");
                        for (Veicolo v : veicoli) {
                            v.dettagli();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Uscita...");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}
