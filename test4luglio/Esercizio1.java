class Veicolo{
    protected String marca;
    protected String modello;
    protected int anno;
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
    Veicolo(String marca, String modello, int anno){
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }
     public String toString() {
        return "Veicolo: marca" + marca  +" modello " + modello + " anno " + anno;
    }

    
}

class Auto extends Veicolo{
    private int numeroPorte;
    Auto(String marca, String modello, int anno, int numeroPorte){
        super(marca, modello, anno);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public String toString() {
        return "Auto : marca" + marca  +" modello " + modello + " anno " + anno + "numero porte: "+ numeroPorte;
    }

}

class Moto extends Veicolo{
    private String tipoManubrio;
    Moto(String marca, String modello, int anno, String tipoManubrio){
        super(marca, modello, anno);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public String toString() {
        return "Moto : marca" + marca  +" modello " + modello + " anno " + anno + "tipo di manubtio: "+ tipoManubrio;
    }

}



public class Esercizio1 {
    public static void main(String[] args) {

        Auto auto = new Auto("Fiat", "Panda", 2019, 5);
        Moto moto = new Moto("Ducati", "non conosco modelli di moto", 2016, "manuale");
        
        System.out.println(auto);
        System.out.println(moto);
    }
    
}
