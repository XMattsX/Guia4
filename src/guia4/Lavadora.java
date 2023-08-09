package guia4;

public class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char comsumo, double peso) {
        super(precio, color, comsumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal+=500;
        }
        return precioFinal;
    }
    
    
}
