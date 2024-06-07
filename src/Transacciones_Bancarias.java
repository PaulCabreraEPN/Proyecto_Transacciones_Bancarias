import java.util.Date;

public class Transacciones_Bancarias extends Cliente {
    String id_transaccion;
    String Tipo_transaccion;
    Date fecha_transaccion;
    String ubicacion_transaccion;

    public Transacciones_Bancarias() {}

    public Transacciones_Bancarias(String numero_cuenta, String nombre_usuario, String cedula_usuario, double saldo_actual, String id_transaccion, String tipo_transaccion, Date fecha_transaccion, String ubicacion_transaccion) {
        super(numero_cuenta, nombre_usuario, cedula_usuario, saldo_actual);
        this.id_transaccion = id_transaccion;
        Tipo_transaccion = tipo_transaccion;
        this.fecha_transaccion = fecha_transaccion;
        this.ubicacion_transaccion = ubicacion_transaccion;
    }

    public String getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(String id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public String getTipo_transaccion() {
        return Tipo_transaccion;
    }

    public void setTipo_transaccion(String tipo_transaccion) {
        Tipo_transaccion = tipo_transaccion;
    }

    public Date getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setFecha_transaccion(Date fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    public String getUbicacion_transaccion() {
        return ubicacion_transaccion;
    }

    public void setUbicacion_transaccion(String ubicacion_transaccion) {
        this.ubicacion_transaccion = ubicacion_transaccion;
    }

    public double Saldo_actual() {
        return saldo_actual;
    }

    public double calcular_costo_transaccion() {
        return 0.5;
    }


    public void mostrar_informacion_transaccion() {
        System.out.println("El id_transaccion es: " + id_transaccion);
        System.out.println("El numero de cuenta es: " + numero_cuenta);
        System.out.println("El nombre usuario es: " + nombre_usuario);
        System.out.println("El cedula usuario es: " + cedula_usuario);
        System.out.println("El fecha transaccion es: " + fecha_transaccion);
        System.out.println("El ubicacion transaccion es: " + ubicacion_transaccion);

    }


}
