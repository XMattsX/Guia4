package guia4;

public class Televisor extends Electrodomestico{
    private double resolucion;
    private boolean sintonizaador;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizaador, double precio, String color, char comsumo, double peso) {
        super(precio, color, comsumo, peso);
        this.resolucion = resolucion;
        this.sintonizaador = sintonizaador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizaador() {
        return sintonizaador;
    }

    public void setSintonizaador(boolean sintonizaador) {
        this.sintonizaador = sintonizaador;
    }
    
    
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal=precioFinal + precioFinal*0.3;
        }
        if (sintonizaador) {
            precioFinal+=500;
        }
        return precioFinal;
    }
    
}
