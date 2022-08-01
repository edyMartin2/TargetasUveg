/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EdyMartin2
 */
public class Credito extends CuentaBase {

    /**
     * @params apertura Double
     * Se agrega el *-1 para convertir en negativo
     */
    public Credito(Double apertura) {
        super(apertura*-1);
    }



    /**
     * @return suma de la cantidad y el monto actual + el 0.15 % de intereses
     */
    public double sumarIntereses(Double cantidad){
        double actual = this.getMontoActual();
        double suma_actual_cantidad = cantidad + actual;
        double sumaintereses = (suma_actual_cantidad * 0.15) + suma_actual_cantidad;
        this.setMontoActual(sumaintereses);
        return this.getMontoActual();
    }



}
