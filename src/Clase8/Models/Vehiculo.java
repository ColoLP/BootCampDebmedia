package Clase8.Models;

public class Vehiculo {

    // Inyeccion de dependencia de la clase Motor.

    private Motor motor = null;
    private double velocidad;

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public double enAceleracionDePedal(int presionPedal){
        if(motor != null){
            motor.setPresionPedal(presionPedal);
            int torque = motor.getTorque();
            velocidad = torque * 2;
        }
        return velocidad;
    }

}
