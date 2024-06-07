import java.util.Date;

public class Retiros extends Transacciones_Bancarias{
    double cantidad_retirar;

    public Retiros(double cantidad_retirar) {
        this.cantidad_retirar = cantidad_retirar;
    }

    public Retiros(String numero_cuenta, String nombre_usuario, String cedula_usuario, double saldo_actual, String id_transaccion, String tipo_transaccion, Date fecha_transaccion, String ubicacion_transaccion, double cantidad_retirar) {
        super(numero_cuenta, nombre_usuario, cedula_usuario, saldo_actual, id_transaccion, "RETIRO", fecha_transaccion, ubicacion_transaccion);
        this.cantidad_retirar = cantidad_retirar;
    }

    public double getCantidad_retirar() {
        return cantidad_retirar;
    }

    public void setCantidad_retirar(double cantidad_retirar) {
        this.cantidad_retirar = cantidad_retirar;
    }



    public double calcular_saldo(double saldo_actual, double cantidad_retirar ) {
        return saldo_actual - cantidad_retirar;
    }

    @Override
    public void mostrar_informacion_transaccion(){
        super.mostrar_informacion_transaccion();
        System.out.println("El monto depositado: "+cantidad_retirar);
        System.out.println("El saldo actual es: " + calcular_saldo(saldo_actual, cantidad_retirar));
    }
}
