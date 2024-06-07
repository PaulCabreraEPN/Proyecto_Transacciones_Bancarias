import java.util.Scanner;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        /*
        Scanner x = new Scanner(System.in);
        int opcion = 0;
        do {
        /*System.out.println("-----INICIAR SESION-----");
        System.out.println("Nombre del usuario: ");
        System.out.println("Contraseña: ");
        Scanner sc = new Scanner(System.in);
            System.out.println("-----BANCO PS-----");
            System.out.println("1. Deposito");
            System.out.println("2. Retiro");
            System.out.println("3. Transferencia");
            System.out.println("4. Pago de servicio");
            System.out.println("5. Mostrar Cuenta");
            System.out.println("6. Salir");
            System.out.println("Seleccione el tipo de transaccion que desea: ");
            opcion = x.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Deposito");
                    break;
                case 2:
                    System.out.println("Retiro");
                    break;
                case 3:
                    System.out.println("Transferencia");
                    break;
                case 4:
                    System.out.println("Pago de servicio");
                    break;
                case 5:
                    System.out.println("Mostrar Cuenta");
                    break;
                case 6:
                    System.out.println("Saliendo del programa, gracias por visitarnos");
                default:
                    System.out.println("Opcion no valida, por favor ingrese nuevamente");
            }
        } while (opcion != 6);*/
        Cliente cliente = new Cliente("555555","Juan","1753653458",500);
        Date fecha = new Date(946684800000L);
        Retiros retiro = new Retiros(cliente.numero_cuenta,cliente.nombre_usuario, cliente.cedula_usuario, cliente.saldo_actual,"0001",fecha,"EL jorguito",80);
        Depositos deposito =new Depositos(cliente.numero_cuenta,cliente.nombre_usuario, cliente.cedula_usuario, cliente.saldo_actual,"0001",fecha,"EL jorguito",)
        retiro.mostrar_informacion_transaccion();


    }

}