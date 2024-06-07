import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("5555555","Paul Cabrera","1751431964",100000000);
        Date fecha_hoy = new Date(946684800000L);

        Transacciones_Bancarias trasaccion1 = new Transacciones_Bancarias(cliente1.getNumero_cuenta(), cliente1.nombre_usuario, cliente1.cedula_usuario, cliente1.saldo_actual, "11","retiro",fecha_hoy,"La mitad del mundo" );
        trasaccion1.mostrar_informacion_transaccion();
    }
}