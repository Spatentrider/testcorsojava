class ContoBancario{
  

    private int numeroConto;
    private double saldo;
    private String titolare;

     public int getNumeroConto() {
        return numeroConto;
    }
    public String getTitolare() {
        return titolare;
    }
    public double getSaldo() {
        return saldo;
    }
    ContoBancario(int numeroConto, double saldo, String titolare){
        this.titolare = titolare;
        this.saldo = saldo;
        this.numeroConto = numeroConto;
    }

    public double deposita(double importo){
        System.out.println("Saldo: " + (saldo + importo));
        return saldo += importo;
    }

    public double preleva(double importo){
        if(importo <= saldo){
            saldo -= importo;
            System.out.println("Prelievo effettuato. Saldo: " + saldo);
        }
        else{
            System.out.println("Importo non disponibile. Saldo attuale: " + saldo);
        }
        return saldo;
    }

}

public class Esercizio2 {
    public static void main(String[] args) {

        ContoBancario conto = new ContoBancario(33478, 100, "Mario Rossi");

        conto.deposita(50);
        conto.preleva(200);
        conto.preleva(30);
        
    }
    
}
