package Objetos;

public class Cuenta {

public static void main(String[] args) {

}
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this(titular, 0);
        if (titular==null) {
            System.out.println("Error");
        }
    }

    public Cuenta(String titular, double cantidad) {
            this.titular = titular;
            this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


   public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }


    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }


    @Override
    public String toString() {
        return "El titular " + titular + " posee " + cantidad + " pesitos en la cuenta";
    }

}
