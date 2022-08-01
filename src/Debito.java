public class Debito extends CuentaBase {
    public Debito (Double apertura){
        super(apertura);
    }

    public Double retirar (Double cantidad){
        
        Double cantidadActual = this.getMontoActual();
        
        if(cantidad <= cantidadActual){
            Double resta = cantidadActual - cantidad;
            this.setMontoActual(resta);
        }else{
            System.out.println("No se ah podido retirar la cantidad");
        }

        return this.getMontoActual();

    }

}
