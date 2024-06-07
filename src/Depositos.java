import java.util.Date;

public class Depositos extends Transacciones_Bancarias{
    double cantidad_depositar;

    public Depositos() {}

    public Depositos(String numero_cuenta, String nombre_usuario, String cedula_usuario, double saldo_actual, String id_transaccion, String tipo_transaccion, Date fecha_transaccion, String ubicacion_transaccion, double cantidad_depositar) {
        super(numero_cuenta, nombre_usuario, cedula_usuario, saldo_actual, id_transaccion, "Deposito", fecha_transaccion, ubicacion_transaccion);
        this.cantidad_depositar = cantidad_depositar;
    }

    public double getCantidad_depositar() {
        return cantidad_depositar;
    }

    public void setCantidad_depositar(double cantidad_depositar) {
        this.cantidad_depositar = cantidad_depositar;
    }

    //Calcular deposito

    public double calcular_deposito() {
        return saldo_actual+cantidad_depositar;
    }

    //Metodo de impresion
    @Override
    public void mostrar_informacion_transaccion(){
        super.mostrar_informacion_transaccion();
        System.out.println("Cantidad de depositar: "+cantidad_depositar);
        System.out.println("El saldo actual es: "+calcular_deposito());
    }
}
