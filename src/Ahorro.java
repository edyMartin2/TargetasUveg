public class Ahorro extends CuentaBase {

    /**
     * 
     * @param apertura
     */
    public Ahorro(double apertura){
        super(apertura);
    }

    /** 
     * @param cantidad
     * @return cantidad total de la cuenta
     */
    public Double invertir(Double cantidad){
        Double cantidadTotal = (cantidad * .10) + cantidad;
        this.depositar(cantidadTotal);
        return this.getMontoActual();
    }
}
