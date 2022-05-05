package ObjetosPractica.Tarea.Model;

public class PersonaAgustinGomez {

    // Atributos
    private String nombre; // null
    private int edad;
    private char sexo;
    private int dni;
    private double pesoK;
    private double alturaM;

    public static double altura2;

    // Constructores
    public PersonaAgustinGomez() {
        this.nombre = "";
        this.sexo = '2';
        this.edad = 0;
        this.pesoK = 0;
        this.alturaM = 0;
        this.dni = generaDNI();
    }

    public PersonaAgustinGomez(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.pesoK = 0;
        this.alturaM = 0;
        this.dni = generaDNI();
    }

    public PersonaAgustinGomez(String nombre, int edad, char sexo, double pesoK, double alturaM) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generaDNI();
        this.pesoK = pesoK;
        this.alturaM = alturaM;
    }

    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPesoK(double pesoK) {
        this.pesoK = pesoK;
    }

    public void setAlturaM(double alturaM) {
        this.alturaM = alturaM;
    }

    public int getDni() {
        return dni;
    }

    // Metodos
    public int calcularIMC() {
        double imc = this.pesoK / ((double) Math.pow(this.alturaM, 2));
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public boolean comprobarSexo() {
        return (this.sexo == 'M') || (this.sexo == 'F');
    }

    public int generaDNI() {
        this.dni = (int) (Math.random() * (9999999 - 1000000 + 1) + 9999999);
        return dni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona -> ")
                .append("\nNombre: ").append(nombre)
                .append("\nEdad: ").append(edad)
                .append("\nSexo: ").append(sexo)
                .append("\nDNI: ").append(dni)
                .append("\nPeso (en kilogramos): ").append(pesoK)
                .append("\nAltura (en metros): ").append(alturaM);

        if (comprobarSexo()) {
            sb.append("\nSexo ingresado correctamente");
        } else {
            sb.append("\nSexo ingresado incorrectamente");
        }

        if (esMayorDeEdad()) {
            sb.append("\n").append(nombre).append(" es mayor de edad");
        } else if (!esMayorDeEdad()) {
            sb.append("\n").append(nombre).append(" no es mayor de edad");
        }

        if (calcularIMC() == -1) {
            sb.append("\n").append(this.nombre).append(" esta por debajo del peso adecuado");
        } else if (calcularIMC() == 0) {
            sb.append("\n").append(this.nombre).append(" esta en su peso adecuado");
        } else if (calcularIMC() == 1) {
            sb.append("\n").append(this.nombre).append(" esta por encima del peso adecuado");
        }

        sb.append("\n------------------------------------------------");

        return sb.toString();
    }

}
