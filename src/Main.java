import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner x = new Scanner(System.in);
        int opcion = 0;
        do {
        /*System.out.println("-----INICIAR SESION-----");
        System.out.println("Nombre del usuario: ");
        System.out.println("Contraseña: ");
        Scanner sc = new Scanner(System.in);*/
            System.out.println("-----BANCO PS-----");
            System.out.println("1. Deposito");
            System.out.println("2. Retiro");
            System.out.println("3. Transferencia");
            System.out.println("4. Pago de servicio");
            System.out.println("5. Mostrar Cuenta");
            System.out.println("6. Salirh");
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
        } while (opcion != 6);
    }
}