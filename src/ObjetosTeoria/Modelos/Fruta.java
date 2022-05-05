package ObjetosTeoria.Modelos;

public class Fruta {
    // Atributos

    private String color;
    private String forma;
    private double peso;
    private double altura;
    private double base;

    // Constructores
    public Fruta() {
    }

    public Fruta(String color, String forma, double peso, double altura, double base) {
        this.color = color;
        this.forma = forma;
        this.peso = peso;
        this.altura = altura;
        this.base = base;
    }

    // Setters y Getters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public final double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    // Metodos
    private double getPesoPor10(){
        return 0;
    }

}
