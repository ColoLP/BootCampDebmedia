package Clase8.Models;

public class Motor {
    private int presionPedal;
    private int torque;

    public int getPresionPedal() {
        return presionPedal;
    }

    public void setPresionPedal(int presionPedal) {
        this.presionPedal = presionPedal;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {

        this.torque = torque;
        this.presionPedal = torque + 1 ;
    }

    public Motor() {
    }
}
