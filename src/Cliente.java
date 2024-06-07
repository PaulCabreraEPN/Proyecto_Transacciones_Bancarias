public class Cliente {
    String numero_cuenta;
    String nombre_usuario;
    String cedula_usuario;
    double saldo_actual;

    public Cliente() {
    }

    public Cliente(String numero_cuenta, String nombre_usuario, String cedula_usuario, double saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.nombre_usuario = nombre_usuario;
        this.cedula_usuario = cedula_usuario;
        this.saldo_actual = saldo_actual;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void mostrar_info_cliente(){
        System.out.println("Numero Cuenta: " + numero_cuenta);
        System.out.println("Usuario: " + nombre_usuario);
        System.out.println("Cedula Usuario: " + cedula_usuario);
        System.out.println("Saldo Actual: " + saldo_actual);
    }
}
