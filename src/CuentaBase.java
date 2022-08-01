/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evale
 */
public class CuentaBase {
    private double montoActual;

    public CuentaBase(double apertura) {
       this.montoActual = apertura;
    }
    public void depositar (double monto){
        this.montoActual = this.montoActual + monto;
    }

    public double getMontoActual (){
        return this.montoActual;
    }

    public void setMontoActual(double actual){
        this.montoActual = actual;
    }

}
