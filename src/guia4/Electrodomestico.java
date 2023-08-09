package guia4;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char comsumo;
    protected double peso;

    public Electrodomestico() {
        this.comprobarConsumoEnergetico(comsumo);
        this.comprobarColor(color);
    }

    public Electrodomestico(double precio, String color, char comsumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.comsumo = comsumo;
        this.peso = peso;
        this.comprobarConsumoEnergetico(comsumo);
        this.comprobarColor(color);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getComsumo() {
        return comsumo;
    }

    public void setComsumo(char comsumo) {
        this.comsumo = comsumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (letra != 'a' && letra != 'b' && letra != 'c' && letra != 'd' && letra != 'e') {
            comsumo = 'f';
        }
    }

    private void comprobarColor(String col) {
        if (!col.equalsIgnoreCase("negro") && !col.equalsIgnoreCase("rojo") && !col.equalsIgnoreCase("azul") && !col.equalsIgnoreCase("gris")) {
            color = "blanco";
        }
    }

    private double extraPrecioPeso() {
        double aux = 0;
        if (peso >= 1 && peso <= 19) {
            aux = 100;
        }
        if (peso >= 20 && peso <= 49) {
            aux = 500;
        }
        if (peso >= 50 && peso <= 79) {
            aux = 800;
        }
        if (peso >= 80) {
            aux = 1000;
        }
        return aux;
    }
    
    private double extraPrecioCargaEnergetica(){
        double aux = 0;
        switch (comsumo) {
            case 'a':
                aux = 1000;
                break;
            case 'b':
                aux = 800;
                break;
            case 'c':
                aux = 600;
                break;
            case 'd':
                aux = 500;
                break;
            case 'e':
                aux = 300;
                break;
            case 'f':
                aux = 100;
                break;
        }
        return aux;
    }

    public double precioFinal() {
        return precio + this.extraPrecioCargaEnergetica() + this.extraPrecioPeso();
    }
}
